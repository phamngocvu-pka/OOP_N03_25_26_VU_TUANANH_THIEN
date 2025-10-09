package com.example.hospital.repo;
import com.example.hospital.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DoctorRepo extends JpaRepository<Doctor, Long> {}
