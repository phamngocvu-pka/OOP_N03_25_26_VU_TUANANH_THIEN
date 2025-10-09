package com.example.hospital.service.impl;
import com.example.hospital.domain.Prescription; import com.example.hospital.repo.PrescriptionRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class PrescriptionService extends CrudService<Prescription, Long> {
  private final PrescriptionRepo repo; public PrescriptionService(PrescriptionRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Prescription, Long> repo(){return repo;}
}
