package com.example.hospital.service.impl;
import com.example.hospital.domain.Patient; import com.example.hospital.repo.PatientRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class PatientService extends CrudService<Patient, Long> {
  private final PatientRepo repo; public PatientService(PatientRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Patient, Long> repo(){return repo;}
}
