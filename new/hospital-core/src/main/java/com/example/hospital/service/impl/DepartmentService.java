package com.example.hospital.service.impl;
import com.example.hospital.domain.Department; import com.example.hospital.repo.DepartmentRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class DepartmentService extends CrudService<Department, Long> {
  private final DepartmentRepo repo; public DepartmentService(DepartmentRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Department, Long> repo(){return repo;}
}
