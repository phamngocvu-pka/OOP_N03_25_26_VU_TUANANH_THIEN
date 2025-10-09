package com.example.hospital.web;
import com.example.hospital.domain.Doctor; import com.example.hospital.service.impl.DoctorService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/doctor") public class DoctorController {
  private final DoctorService svc; public DoctorController(DoctorService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Doctor"); return "doctor/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("doctor", new Doctor()); return "doctor/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("doctor") Doctor obj, BindingResult br){ if(br.hasErrors()) return "doctor/form"; svc.save(obj); return "redirect:/doctor"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("doctor", svc.findById(id)); return "doctor/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("doctor") Doctor obj, BindingResult br){ if(br.hasErrors()) return "doctor/form"; svc.save(obj); return "redirect:/doctor"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/doctor"; }
}
