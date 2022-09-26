package com.example.phcbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "followups")

public class Followup {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long followupId;
    private String samId;
    private String ashaWorker, date, diet;
    private Boolean status;
    private Double height, weight, muac;
    private Integer stdev;
    public Followup() {
    }
    public Followup(String samId, String ashaWorker, String date, String diet, Boolean status, Double height,
            Double weight, Double muac, Integer stdev) {
        this.samId = samId;
        this.ashaWorker = ashaWorker;
        this.date = date;
        this.diet = diet;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.muac = muac;
        this.stdev = stdev;
    }
    public long getFollowupId() {
        return followupId;
    }
    public void setFollowupId(long followupId) {
        this.followupId = followupId;
    }
    public String getSamId() {
        return samId;
    }
    public void setSamId(String samId) {
        this.samId = samId;
    }
    public String getAshaWorker() {
        return ashaWorker;
    }
    public void setAshaWorker(String ashaWorker) {
        this.ashaWorker = ashaWorker;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDiet() {
        return diet;
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getMuac() {
        return muac;
    }
    public void setMuac(Double muac) {
        this.muac = muac;
    }
    public Integer getStdev() {
        return stdev;
    }
    public void setStdev(Integer stdev) {
        this.stdev = stdev;
    }
    @Override
    public String toString() {
        return "Followup [followupId=" + followupId + ", samId=" + samId + ", status=" + status + ", stdev=" + stdev
                + ", weight=" + weight + "]";
    }

  
}