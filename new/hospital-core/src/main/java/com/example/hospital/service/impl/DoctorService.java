package com.example.hospital.service.impl;
import com.example.hospital.domain.Doctor; import com.example.hospital.repo.DoctorRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class DoctorService extends CrudService<Doctor, Long> {
  private final DoctorRepo repo; public DoctorService(DoctorRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Doctor, Long> repo(){return repo;}
}
