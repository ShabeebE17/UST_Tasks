package com.ust.JobNotificationApplication.service;

import com.ust.JobNotificationApplication.model.JobNotification;
import com.ust.JobNotificationApplication.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class JobNotificationService
        {

@Autowired
private JobRepository jobRepository;

public JobNotification addJobNotification(JobNotification jobNotification) {
    return jobRepository.save(jobNotification);
}

public List<JobNotification> getAllJobNotifications() {
    return jobRepository.findAll();
}

public JobNotification getJobNotificationById(Long id) {
    return jobRepository.findById(id).orElse(null);
}
}