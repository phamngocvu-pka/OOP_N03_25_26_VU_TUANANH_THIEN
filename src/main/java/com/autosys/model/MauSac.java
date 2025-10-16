package com.autosys.model;

public enum MauSac {
    TRANG, DEN, BAC, DO, XANH, XAM;

    @Override
    public String toString() {
        switch (this) {
            case TRANG: return "TRẮNG";
            case DEN:   return "ĐEN";
            case BAC:   return "BẠC";
            case DO:    return "ĐỎ";
            case XANH:  return "XANH";
            case XAM:   return "XÁM";
            default:    return name();
        }
    }
}
