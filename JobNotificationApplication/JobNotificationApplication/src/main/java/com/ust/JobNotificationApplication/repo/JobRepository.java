package com.ust.JobNotificationApplication.repo;

import com.ust.JobNotificationApplication.model.JobNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobNotification, Long> {
}