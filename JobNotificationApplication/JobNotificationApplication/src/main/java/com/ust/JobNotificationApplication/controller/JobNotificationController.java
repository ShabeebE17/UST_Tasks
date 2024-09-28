package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.JobNotification;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {

    @Autowired
    private JobNotificationService jobNotificationService;

    @PostMapping
    public JobNotification addJobNotification(@RequestBody JobNotification jobNotification) {
        return jobNotificationService.addJobNotification(jobNotification);
    }

    @GetMapping
    public List<JobNotification> getAllJobNotifications() {
        return jobNotificationService.getAllJobNotifications();
    }

    @GetMapping("/{id}")
    public JobNotification getJobNotificationById(@PathVariable Long id) {
        return jobNotificationService.getJobNotificationById(id);
    }
}
