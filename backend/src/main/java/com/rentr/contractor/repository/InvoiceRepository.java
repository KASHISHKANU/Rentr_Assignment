package com.rentr.contractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rentr.contractor.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
