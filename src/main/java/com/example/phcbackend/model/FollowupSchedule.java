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
    private Long followupScheduleID;
    private String samID;
    private String ashaID;
    private LocalDate scheduledVisit;
    private String status;
    public FollowupSchedule() {
    }
    public FollowupSchedule(String samID, String ashaID, LocalDate scheduledVisit, String status) {
        this.samID = samID;
        this.ashaID = ashaID;
        this.scheduledVisit = scheduledVisit;
        this.status = status;
    }
    public Long getFollowupScheduleID() {
        return followupScheduleID;
    }
    public void setFollowupScheduleID(Long followupScheduleID) {
        this.followupScheduleID = followupScheduleID;
    }
    public String getSamID() {
        return samID;
    }
    public void setSamID(String samID) {
        this.samID = samID;
    }
    public String getAshaID() {
        return ashaID;
    }
    public void setAshaID(String ashaID) {
        this.ashaID = ashaID;
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