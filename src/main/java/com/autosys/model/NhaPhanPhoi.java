package com.autosys.model;

import java.util.ArrayList;
import java.util.List;

/** Lớp cơ sở cho mọi đơn vị trong hệ (Cửa hàng chính, Ủy nhiệm, Chi nhánh, Phòng ban...) */
public abstract class NhaPhanPhoi {
    private String doanhNghiep;  // ví dụ: Honda Vietnam
    private String quocGia;      // Việt Nam
    private String khuVuc;       // Miền Bắc/Miền Trung/Miền Nam
    private String tenCuaHang;   // tên hiển thị
    private String diaChi;       // thành phố/quận
    private List<Car> danhSachXe = new ArrayList<>();

    public NhaPhanPhoi() {}

    public NhaPhanPhoi(String doanhNghiep, String quocGia, String khuVuc, String tenCuaHang, String diaChi) {
        this.doanhNghiep = doanhNghiep;
        this.quocGia = quocGia;
        this.khuVuc = khuVuc;
        this.tenCuaHang = tenCuaHang;
        this.diaChi = diaChi;
    }

    public void themXe(Car car) { this.danhSachXe.add(car); }

    // getters & setters
    public String getDoanhNghiep() { return doanhNghiep; }
    public void setDoanhNghiep(String doanhNghiep) { this.doanhNghiep = doanhNghiep; }
    public String getQuocGia() { return quocGia; }
    public void setQuocGia(String quocGia) { this.quocGia = quocGia; }
    public String getKhuVuc() { return khuVuc; }
    public void setKhuVuc(String khuVuc) { this.khuVuc = khuVuc; }
    public String getTenCuaHang() { return tenCuaHang; }
    public void setTenCuaHang(String tenCuaHang) { this.tenCuaHang = tenCuaHang; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public List<Car> getDanhSachXe() { return danhSachXe; }
    public void setDanhSachXe(List<Car> danhSachXe) { this.danhSachXe = danhSachXe; }
}
