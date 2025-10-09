package com.example.hospital.web;
import com.example.hospital.domain.Prescription; import com.example.hospital.service.impl.PrescriptionService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/prescription") public class PrescriptionController {
  private final PrescriptionService svc; public PrescriptionController(PrescriptionService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Prescription"); return "prescription/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("prescription", new Prescription()); return "prescription/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("prescription") Prescription obj, BindingResult br){ if(br.hasErrors()) return "prescription/form"; svc.save(obj); return "redirect:/prescription"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("prescription", svc.findById(id)); return "prescription/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("prescription") Prescription obj, BindingResult br){ if(br.hasErrors()) return "prescription/form"; svc.save(obj); return "redirect:/prescription"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/prescription"; }
}
