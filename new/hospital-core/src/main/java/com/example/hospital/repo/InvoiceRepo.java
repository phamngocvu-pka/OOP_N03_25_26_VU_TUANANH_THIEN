package com.example.hospital.repo;
import com.example.hospital.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InvoiceRepo extends JpaRepository<Invoice, Long> {}
