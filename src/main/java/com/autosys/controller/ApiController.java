package com.autosys.controller;

import com.autosys.model.*;
import com.autosys.service.HeThongQuanLy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final HeThongQuanLy svc;

    public ApiController(HeThongQuanLy svc) {
        this.svc = svc;
    }

    // Doanh nghiệp
    @GetMapping(value = "/enterprise", produces = MediaType.TEXT_PLAIN_VALUE)
    public String enterprise() {
        return svc.getCenter().getDoanhNghiep();
    }

    // Tất cả xe (dùng cho trang "Xe")
    @GetMapping("/cars")
    public List<Car> cars() {
        return svc.getAllCars();
    }

    // Thống kê màu
    @GetMapping("/stats/colors")
    public Map<String, Long> colorStats() {
        return svc.colorStats().entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey().toString(), Map.Entry::getValue,
                        (a,b)->a, LinkedHashMap::new));
    }

    // Cửa hàng trung tâm
    @GetMapping("/center")
    public CuaHangChinh center() {
        return svc.getCenter();
    }

    // Nhà phân phối -> JS đang đọc { baoCao: "..." }
    @GetMapping("/distributors")
    public List<Map<String, String>> distributors() {
        List<Map<String,String>> out = new ArrayList<>();
        for (NhaPhanPhoi n : svc.getNpp()) {
            String label;
            if (n instanceof PhongBan) {
                // ưu tiên tên bộ phận nếu có
                String tenBoPhan = ((PhongBan) n).getTenBoPhan();
                label = (tenBoPhan != null && !tenBoPhan.isEmpty()) ? tenBoPhan : n.getTenCuaHang();
            } else {
                label = n.getTenCuaHang();
            }
            out.add(Collections.singletonMap("baoCao", label));
        }
        return out;
    }

    // Cửa hàng ủy nhiệm
    @GetMapping("/stores/authorized")
    public List<CuaHangUyNhiem> authorized() {
        return svc.getAuthorized();
    }

    // Chi nhánh (có phường)
    @GetMapping("/branches")
    public List<ChiNhanhDiaPhuong> branches() {
        return svc.getBranches();
    }
}
