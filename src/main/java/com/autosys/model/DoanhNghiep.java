package com.autosys.model;
public abstract class DoanhNghiep implements BaoCao {
    protected String ten;
    protected String quocGia;

    public DoanhNghiep(String ten, String quocGia) {
        this.ten = ten;
        this.quocGia = quocGia;
    }

    public String getTen() { return ten; }
    public String getQuocGia() { return quocGia; }

    @Override
    public String baoCao() {
        return "DoanhNghiep: " + ten + " (" + quocGia + ")";
    }
}
