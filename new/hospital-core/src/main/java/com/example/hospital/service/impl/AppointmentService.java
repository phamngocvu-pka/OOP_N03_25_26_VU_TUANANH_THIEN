package com.example.hospital.service.impl;
import com.example.hospital.domain.Appointment; import com.example.hospital.repo.AppointmentRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class AppointmentService extends CrudService<Appointment, Long> {
  private final AppointmentRepo repo; public AppointmentService(AppointmentRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Appointment, Long> repo(){return repo;}
}
