package com.autosys.model;

/** Cửa hàng ủy nhiệm */
public class CuaHangUyNhiem extends NhaPhanPhoi {
    public CuaHangUyNhiem() {}

    public CuaHangUyNhiem(String doanhNghiep, String quocGia, String khuVuc,
                          String tenCuaHang, String diaChi) {
        super(doanhNghiep, quocGia, khuVuc, tenCuaHang, diaChi);
    }
}
