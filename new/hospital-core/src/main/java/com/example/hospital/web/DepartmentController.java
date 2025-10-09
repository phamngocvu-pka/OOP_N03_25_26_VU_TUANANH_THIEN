package com.example.hospital.web;
import com.example.hospital.domain.Department; import com.example.hospital.service.impl.DepartmentService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/department") public class DepartmentController {
  private final DepartmentService svc; public DepartmentController(DepartmentService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Department"); return "department/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("department", new Department()); return "department/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("department") Department obj, BindingResult br){ if(br.hasErrors()) return "department/form"; svc.save(obj); return "redirect:/department"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("department", svc.findById(id)); return "department/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("department") Department obj, BindingResult br){ if(br.hasErrors()) return "department/form"; svc.save(obj); return "redirect:/department"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/department"; }
}
