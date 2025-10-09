package com.example.hospital.repo;
import com.example.hospital.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepo extends JpaRepository<Department, Long> {}
