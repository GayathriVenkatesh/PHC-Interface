package com.example.phcbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")

public class Patient { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    private String rchId, samId, aadharId, abhaId, contactNo, nrcFrom;
    private Integer stdev;
    private String name;
    private String dischargeDate;
    
    public Patient(String rchId, String samId, String contactNo, String nrcFrom, Integer stdev, String name,
            String dischargeDate) {
        this.rchId = rchId;
        this.samId = samId;
        this.contactNo = contactNo;
        this.nrcFrom = nrcFrom;
        this.stdev = stdev;
        this.name = name;
        this.dischargeDate = dischargeDate;
    }

    public Patient(String rchId, String samId, String aadharId, String abhaId, String contactNo, String nrcFrom,
            Integer stdev, String name, String dischargeDate) {
        this.rchId = rchId;
        this.samId = samId;
        this.aadharId = aadharId;
        this.abhaId = abhaId;
        this.contactNo = contactNo;
        this.nrcFrom = nrcFrom;
        this.stdev = stdev;
        this.name = name;
        this.dischargeDate = dischargeDate;
    }

    public Patient() {
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getRchId() {
        return rchId;
    }

    public void setRchId(String rchId) {
        this.rchId = rchId;
    }

    public String getSamId() {
        return samId;
    }

    public void setSamId(String samId) {
        this.samId = samId;
    }

    public String getAadharId() {
        return aadharId;
    }

    public void setAadharId(String aadharId) {
        this.aadharId = aadharId;
    }

    public String getAbhaId() {
        return abhaId;
    }

    public void setAbhaId(String abhaId) {
        this.abhaId = abhaId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getNrcFrom() {
        return nrcFrom;
    }

    public void setNrcFrom(String nrcFrom) {
        this.nrcFrom = nrcFrom;
    }

    public Integer getStdev() {
        return stdev;
    }

    public void setStdev(Integer stdev) {
        this.stdev = stdev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    
}