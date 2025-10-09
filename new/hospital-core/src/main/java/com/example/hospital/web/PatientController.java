package com.example.hospital.web;
import com.example.hospital.domain.Patient; import com.example.hospital.service.impl.PatientService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/patient") public class PatientController {
  private final PatientService svc; public PatientController(PatientService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Patient"); return "patient/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("patient", new Patient()); return "patient/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("patient") Patient obj, BindingResult br){ if(br.hasErrors()) return "patient/form"; svc.save(obj); return "redirect:/patient"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("patient", svc.findById(id)); return "patient/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("patient") Patient obj, BindingResult br){ if(br.hasErrors()) return "patient/form"; svc.save(obj); return "redirect:/patient"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/patient"; }
}
