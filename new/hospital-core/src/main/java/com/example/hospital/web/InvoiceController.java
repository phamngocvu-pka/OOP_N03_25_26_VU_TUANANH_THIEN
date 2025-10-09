package com.example.hospital.web;
import com.example.hospital.domain.Invoice; import com.example.hospital.service.impl.InvoiceService;
import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/invoice") public class InvoiceController {
  private final InvoiceService svc; public InvoiceController(InvoiceService s){this.svc=s;}
  @GetMapping public String list(Model m){ m.addAttribute("items", svc.findAll()); m.addAttribute("title","Invoice"); return "invoice/list"; }
  @GetMapping("/create") public String createForm(Model m){ m.addAttribute("invoice", new Invoice()); return "invoice/form"; }
  @PostMapping public String create(@Valid @ModelAttribute("invoice") Invoice obj, BindingResult br){ if(br.hasErrors()) return "invoice/form"; svc.save(obj); return "redirect:/invoice"; }
  @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("invoice", svc.findById(id)); return "invoice/form"; }
  @PostMapping("/{id}") public String update(@PathVariable Long id, @Valid @ModelAttribute("invoice") Invoice obj, BindingResult br){ if(br.hasErrors()) return "invoice/form"; svc.save(obj); return "redirect:/invoice"; }
  @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ svc.delete(id); return "redirect:/invoice"; }
}
