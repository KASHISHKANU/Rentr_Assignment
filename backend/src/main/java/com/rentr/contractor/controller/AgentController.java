package com.rentr.contractor.controller;

import com.rentr.contractor.model.Job;
import com.rentr.contractor.repository.JobRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private JobRepository jobRepository;

    @PostMapping("/jobs")
    public Job createJob(@RequestBody Job job) {
        job.setStatus("CREATED");
        return jobRepository.save(job);
    }

    @PutMapping("/jobs/{id}/approve")
    public Job approveJob(@PathVariable Long id) {
        Job job = jobRepository.findById(id).orElseThrow();
        job.setStatus("APPROVED");
        return jobRepository.save(job);
    }
}
