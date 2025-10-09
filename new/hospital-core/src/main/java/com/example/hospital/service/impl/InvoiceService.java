package com.example.hospital.service.impl;
import com.example.hospital.domain.Invoice; import com.example.hospital.repo.InvoiceRepo; import com.example.hospital.service.CrudService;
import org.springframework.stereotype.Service; import org.springframework.data.jpa.repository.JpaRepository;
@Service public class InvoiceService extends CrudService<Invoice, Long> {
  private final InvoiceRepo repo; public InvoiceService(InvoiceRepo repo){this.repo=repo;}
  @Override protected JpaRepository<Invoice, Long> repo(){return repo;}
}
