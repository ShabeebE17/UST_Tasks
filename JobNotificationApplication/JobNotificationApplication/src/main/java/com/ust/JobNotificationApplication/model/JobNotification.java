package com.ust.JobNotificationApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobNotification {
    @Id
    private Long id;
    private String jobTitle;
    private String description;
    private String location;
    private Double salary;
}
