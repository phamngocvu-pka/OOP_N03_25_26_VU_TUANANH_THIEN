package com.autosys.service;
import com.autosys.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HeThongQuanLy {
    private final CuaHangChinh center;
    private final List<NhaPhanPhoi> npp = new ArrayList<>();
    private final List<CuaHangUyNhiem> authorized = new ArrayList<>();
    private final List<ChiNhanhDiaPhuong> branches = new ArrayList<>();

    public HeThongQuanLy() {
        // Seed enterprise hierarchy
        center = new CuaHangChinh("Honda Vietnam", "Việt Nam", "Miền Bắc", "Honda Center Hà Nội", "Hà Nội");
        center.themXe(new Car("A001", "Civic 2024", "Honda", MauSac.TRANG, 850_000_000, "hondacivic2024.jpg"));
        center.themXe(new Car("A002", "CR-V 2024", "Honda", MauSac.DEN, 1_100_000_000, "hodacrv2024.jpg"));

        PhongBan sales = new PhongBan("Honda Vietnam", "Việt Nam", "Miền Bắc", "Honda Center Hà Nội", "Hà Nội", "Bán Hàng");
        sales.getDanhSachXe().add(new Car("A003", "City 2024", "Honda", MauSac.BAC, 560_000_000, "hondacity2024.jpg"));
        npp.add(sales);

        CuaHangUyNhiem hcm = new CuaHangUyNhiem("Honda Vietnam", "Việt Nam", "Miền Nam", "Honda Quận 7", "TP. HCM");
        hcm.themXe(new Car("B101", "HR-V 2024", "Honda", MauSac.DO, 899_000_000, "hodahrv2024.jpg"));
        authorized.add(hcm);
        npp.add(hcm);

        ChiNhanhDiaPhuong hcmA = new ChiNhanhDiaPhuong("Honda Vietnam", "Việt Nam", "Miền Nam", "Honda Quận 7 - Cơ sở A", "Quận 7", "Tân Phong");
        hcmA.getDanhSachXe().add(new Car("B102", "City 2024", "Honda", MauSac.XANH, 560_000_000, "hondacity2024.jpg"));
        branches.add(hcmA);
        npp.add(hcmA);

        CuaHangUyNhiem dn = new CuaHangUyNhiem("Honda Vietnam", "Việt Nam", "Miền Trung", "Honda Đà Nẵng", "Đà Nẵng");
        dn.themXe(new Car("C201", "CR-V 2024", "Honda", MauSac.TRANG, 1_100_000_000, "hodacrvt2024.jpg"));
        authorized.add(dn);
        npp.add(dn);
    }

    public CuaHangChinh getCenter() { return center; }
    public List<NhaPhanPhoi> getNpp() { return npp; }
    public List<CuaHangUyNhiem> getAuthorized() { return authorized; }
    public List<ChiNhanhDiaPhuong> getBranches() { return branches; }

    public List<Car> getAllCars() {
        List<Car> all = new ArrayList<>(center.getDanhSachXe());
        npp.forEach(x -> {
            if (x instanceof CuaHangChinh c) all.addAll(c.getDanhSachXe());
            if (x instanceof CuaHangUyNhiem u) all.addAll(u.getDanhSachXe());
            if (x instanceof ChiNhanhDiaPhuong b) all.addAll(b.getDanhSachXe());
        });
        return all;
    }

    public Map<MauSac, Long> colorStats() {
        return getAllCars().stream().collect(Collectors.groupingBy(Car::getColor, Collectors.counting()));
    }
}
