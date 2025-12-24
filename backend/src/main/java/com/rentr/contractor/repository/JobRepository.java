package com.rentr.contractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rentr.contractor.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
