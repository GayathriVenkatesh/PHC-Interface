package com.example.phcbackend.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "followup_schedule")

public class FollowupSchedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followupScheduleId;
    private String samId;
    private String ashaId;
    private LocalDate scheduledVisit;
    private String status;
    public FollowupSchedule() {
    }
    public FollowupSchedule(String samId, String ashaId, LocalDate scheduledVisit, String status) {
        this.samId = samId;
        this.ashaId = ashaId;
        this.scheduledVisit = scheduledVisit;
        this.status = status;
    }
    public Long getFollowupScheduleID() {
        return followupScheduleId;
    }
    public void setFollowupScheduleID(Long followupScheduleId) {
        this.followupScheduleId = followupScheduleId;
    }
    public String getSamID() {
        return samId;
    }
    public void setSamID(String samId) {
        this.samId = samId;
    }
    public String getAshaID() {
        return ashaId;
    }
    public void setAshaID(String ashaId) {
        this.ashaId = ashaId;
    }
    public LocalDate getScheduledVisit() {
        return scheduledVisit;
    }
    public void setScheduledVisit(LocalDate scheduledVisit) {
        this.scheduledVisit = scheduledVisit;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

  
}
