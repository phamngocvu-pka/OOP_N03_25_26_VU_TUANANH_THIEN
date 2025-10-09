package com.example.hospital.web;
import com.example.hospital.domain.Appointment; import com.example.hospital.service.impl.AppointmentService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/appointment") public class AppointmentController {
  private final AppointmentService svc; public AppointmentController(AppointmentService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Appointment"); return "appointment/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("appointment", new Appointment()); return "appointment/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("appointment") Appointment obj, BindingResult br){ if(br.hasErrors()) return "appointment/form"; svc.save(obj); return "redirect:/appointment"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("appointment", svc.findById(id)); return "appointment/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("appointment") Appointment obj, BindingResult br){ if(br.hasErrors()) return "appointment/form"; svc.save(obj); return "redirect:/appointment"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/appointment"; }
}
