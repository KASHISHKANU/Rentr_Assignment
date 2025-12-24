package com.rentr.contractor.controller;

import com.rentr.contractor.model.WorkOrder;
import com.rentr.contractor.model.Invoice;
import com.rentr.contractor.repository.WorkOrderRepository;
import com.rentr.contractor.repository.InvoiceRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    private WorkOrderRepository workOrderRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @PostMapping("/workorders")
    public WorkOrder createWorkOrder(@RequestBody WorkOrder workOrder) {
        workOrder.setStatus("CREATED");
        return workOrderRepository.save(workOrder);
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        invoice.setStatus("CREATED");
        return invoiceRepository.save(invoice);
    }
}
