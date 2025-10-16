package com.autosys.model;

/** Chi nhánh địa phương: thêm trường phường/xã */
public class ChiNhanhDiaPhuong extends NhaPhanPhoi {
    private String phuong;

    public ChiNhanhDiaPhuong() {}

    public ChiNhanhDiaPhuong(String doanhNghiep, String quocGia, String khuVuc,
                             String tenCuaHang, String diaChi, String phuong) {
        super(doanhNghiep, quocGia, khuVuc, tenCuaHang, diaChi);
        this.phuong = phuong;
    }

    public String getPhuong() { return phuong; }
    public void setPhuong(String phuong) { this.phuong = phuong; }
}
