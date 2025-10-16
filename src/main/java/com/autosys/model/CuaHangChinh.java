package com.autosys.model;

/** Cửa hàng trung tâm */
public class CuaHangChinh extends NhaPhanPhoi {
    public CuaHangChinh() {}

    public CuaHangChinh(String doanhNghiep, String quocGia, String khuVuc,
                        String tenCuaHang, String diaChi) {
        super(doanhNghiep, quocGia, khuVuc, tenCuaHang, diaChi);
    }
}
