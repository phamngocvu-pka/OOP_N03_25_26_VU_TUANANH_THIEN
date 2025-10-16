package com.autosys.model;

/** Dùng để biểu diễn NPP dạng phòng ban (đúng như bạn đang seed) */
public class PhongBan extends NhaPhanPhoi {
    private String tenBoPhan;  // ví dụ: "Bán Hàng" hoặc tên NPP

    public PhongBan() {}

    public PhongBan(String doanhNghiep, String quocGia, String khuVuc,
                    String tenCuaHang, String diaChi, String tenBoPhan) {
        super(doanhNghiep, quocGia, khuVuc, tenCuaHang, diaChi);
        this.tenBoPhan = tenBoPhan;
    }

    public String getTenBoPhan() { return tenBoPhan; }
    public void setTenBoPhan(String tenBoPhan) { this.tenBoPhan = tenBoPhan; }
}
