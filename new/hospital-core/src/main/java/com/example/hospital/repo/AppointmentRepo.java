package com.example.hospital.repo;
import com.example.hospital.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {}
