package com.rentr.contractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rentr.contractor.model.WorkOrder;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {
}
