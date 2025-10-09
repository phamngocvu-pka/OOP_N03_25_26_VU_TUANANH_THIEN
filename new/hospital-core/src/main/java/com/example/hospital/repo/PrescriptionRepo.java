package com.example.hospital.repo;
import com.example.hospital.domain.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {}
