package com.example.hospital.web;
import com.example.hospital.service.impl.*; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.GetMapping;
@Controller public class HomeController{
  private final PatientService p; private final DoctorService d; private final AppointmentService a;
  public HomeController(PatientService p, DoctorService d, AppointmentService a){ this.p=p; this.d=d; this.a=a; }
  @GetMapping("/") public String index(Model m){ m.addAttribute("patients", p.findAll().size()); m.addAttribute("doctors", d.findAll().size()); m.addAttribute("appointments", a.findAll().size()); m.addAttribute("title","Hospital Dashboard"); return "index"; }
}
