const $  = (s)=>document.querySelector(s);
const $$ = (s)=>Array.from(document.querySelectorAll(s));

async function api(p){ const r = await fetch(p); return p==='/api/enterprise'?r.text():r.json(); }
const money = n => (n||0).toLocaleString('vi-VN') + ' VNĐ';

/* ===== NAV & THEME ===== */
function bindNav(){
  $$('.nav-btn, .tab').forEach(b=>{
    b.addEventListener('click', ()=>{
      $$('.tab').forEach(t=>t.classList.remove('active'));
      const view = b.dataset.view;
      $$('.view').forEach(v=>v.classList.add('hidden'));
      $('#view-'+view)?.classList.remove('hidden');
      b.classList.add('active');
    });
  });

  $$('.quick-item').forEach(a=>{
    a.addEventListener('click', ()=>{
      const target=a.dataset.goto || 'dashboard';
      document.querySelector(`.tab[data-view="${target}"]`)?.click();
    });
  });
}
function bindTheme(){
  const KEY='theme';
  const apply=t=>document.documentElement.dataset.theme=t;
  const saved=localStorage.getItem(KEY)||'dark'; apply(saved);
  const btn=$('#toggleTheme'); if(btn){
    btn.textContent = saved==='dark'?'☀️':'🌙';
    btn.onclick=()=>{
      const next=document.documentElement.dataset.theme==='dark'?'light':'dark';
      apply(next); localStorage.setItem(KEY,next);
      btn.textContent = next==='dark'?'☀️':'🌙';
    };
  }
}
(function syncThemeClass(){
  // map dataset theme -> css variables set ở :root (đã là dark mặc định)
  const t = document.documentElement.dataset.theme||'dark';
  if(t==='light'){ document.documentElement.style.setProperty('--bg','#f6f8fb'); /* giữ dark mặc định đẹp hơn */ }
})();

/* ===== DASHBOARD ===== */
function setGauge(percent,total){
  // arc 180deg: start (10,60) radius 50
  const p = Math.max(0, Math.min(100, percent));
  const ang = Math.PI * (1 - p/100);
  const x = 60 + 50*Math.cos(ang);
  const y = 60 - 50*Math.sin(ang);
  const large = p>50 ? 1 : 0;
  $('#gArc').setAttribute('d', `M10,60 A50,50 0 ${large} 1 ${x.toFixed(1)},${y.toFixed(1)}`);
  $('#gVal').textContent = total;
}

function renderColorBars(stats,total){
  const wrap = $('#colorStats'); wrap.innerHTML='';
  const entries = Object.entries(stats);
  entries.forEach(([color,count])=>{
    const row=document.createElement('div'); row.className='bar-row';
    const label=document.createElement('div'); label.className='bar-label'; label.textContent=color;
    const track=document.createElement('div'); track.className='bar-track';
    const fill=document.createElement('div'); fill.className='bar-fill'; fill.style.width = ((count/total)*100).toFixed(1)+'%';
    const num=document.createElement('div'); num.className='muted'; num.textContent = Math.round((count/total)*100)+'%';
    track.appendChild(fill); row.append(label, track, num); wrap.appendChild(row);
  });
}

async function renderDashboard(){
  const enterprise = await api('/api/enterprise'); $('#enterprise').textContent = enterprise;

  const cars = await api('/api/cars');
  $('#totalCars').textContent = cars.length;

  const stats = await api('/api/stats/colors');
  renderColorBars(stats, cars.length);
  setGauge( Math.min(100, cars.length ? 100 : 0), cars.length );

  const center = await api('/api/center');
  $('#centerInfo').textContent = `${center.tenCuaHang} — ${center.diaChi} — ${center.danhSachXe.length} xe`;
  $('#centerAddr').textContent = center.diaChi || '—';
  $('#centerPhone').textContent = center.soDienThoai || '0123.456.789';
  $('#centerMail').textContent  = center.email || 'contact@cuahangtrungtam.com';
}

/* ===== CARS (tìm kiếm + sắp xếp + phân trang) ===== */
function carCard(c){
  const div=document.createElement('div'); div.className='car';
  div.innerHTML = `
    <img src="/img/${c.image}" alt="${c.brand} ${c.name}">
    <h4>${c.brand} ${c.name}</h4>
    <div class="muted">Màu: ${c.color}</div>
    <div class="muted">Giá: ${money(c.price)}</div>
  `;
  return div;
}

async function renderCars(){
  const all = await api('/api/cars');
  const grid = $('#carGrid');
  const qn=$('#qName'), qb=$('#qBrand'), qc=$('#qColor'), sortSel=$('#sortBy');
  const prev=$('#prevPage'), next=$('#nextPage'), info=$('#pageInfo');
  const PAGE=8; let page=1;

  const applySort = arr=>{
    const v=sortSel.value; const a=[...arr];
    if(v==='priceAsc') a.sort((x,y)=>x.price-y.price);
    if(v==='priceDesc') a.sort((x,y)=>y.price-x.price);
    if(v==='nameAsc')  a.sort((x,y)=> (x.name+x.brand).localeCompare(y.name+y.brand,'vi'));
    return a;
  };

  const render = ()=>{
    const k1=(qn.value||'').toLowerCase().trim();
    const k2=(qb.value||'').toLowerCase().trim();
    const k3=(qc.value||'').toLowerCase().trim();

    const filtered = all.filter(c =>
      (!k1 || (c.name+' '+c.brand).toLowerCase().includes(k1)) &&
      (!k2 || c.brand.toLowerCase().includes(k2)) &&
      (!k3 || String(c.color).toLowerCase().includes(k3))
    );

    const arr = applySort(filtered);
    const pages = Math.max(1, Math.ceil(arr.length/PAGE));
    page = Math.min(page, pages);
    const start=(page-1)*PAGE, end=start+PAGE;

    grid.innerHTML=''; arr.slice(start,end).forEach(c=>grid.appendChild(carCard(c)));
    info.textContent = `${page}/${pages}`;
    prev.disabled = page<=1; next.disabled = page>=pages;
  };

  [qn,qb,qc,sortSel].forEach(i=>i.addEventListener('input', ()=>{page=1;render();}));
  prev.onclick = ()=>{ if(page>1){ page--; render(); } };
  next.onclick = ()=>{ if(true){ page++; render(); } };

  // Global search trên topbar
  $('#globalSearch')?.addEventListener('input', e=>{
    const kw = e.target.value.trim().toLowerCase();
    qn.value = kw; page=1; render();
  });

  render();
}

/* ===== Lists ===== */
async function renderLists(){
  const npp = await api('/api/distributors');
  const ul1 = $('#nppList'); if(ul1){ ul1.innerHTML=''; npp.forEach(x=>{ const li=document.createElement('li'); li.textContent=x.baoCao; ul1.appendChild(li); }); }

  const auth = await api('/api/stores/authorized');
  const ul2 = $('#authList'); if(ul2){ ul2.innerHTML=''; auth.forEach(x=>{ const li=document.createElement('li'); li.textContent=`${x.tenCuaHang} — ${x.diaChi} — ${x.danhSachXe.length} xe`; ul2.appendChild(li); }); }

  const branches = await api('/api/branches');
  const ul3 = $('#branchList'); if(ul3){ ul3.innerHTML=''; branches.forEach(x=>{ const li=document.createElement('li'); li.textContent=`${x.tenCuaHang} — ${x.diaChi} — ${x.phuong||''} — ${x.danhSachXe.length} xe`; ul3.appendChild(li); }); }
}

/* ===== Boot ===== */
document.addEventListener('DOMContentLoaded', ()=>{
  bindNav(); bindTheme();
  // mặc định mở dashboard
  $$('.view').forEach(v=>v.classList.add('hidden'));
  $('#view-dashboard').classList.remove('hidden');

  renderDashboard();
  renderCars();
  renderLists();
});
