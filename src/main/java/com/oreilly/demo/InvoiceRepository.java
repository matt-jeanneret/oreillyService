package com.oreilly.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findBycustomerId(Long customerId);
}
