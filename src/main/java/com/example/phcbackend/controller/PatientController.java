package com.example.phcbackend.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.phcbackend.model.Patient;
import com.example.phcbackend.repository.PatientRepository;

@RestController
@CrossOrigin
public class PatientController {

    // standard constructors
    
    private final PatientRepository patientRepository;

    @Autowired
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patients")
    public List<Patient> getPatient() {
        return (List<Patient>) this.patientRepository.findAll();
    }

    @GetMapping("/patient/{rchId}")
	public Optional<Patient> getPatientById(@PathVariable String rchId) {
        System.out.println("RCH ID " + rchId);
		return this.patientRepository.findByRchId(rchId);			
	}

    @PostMapping("/patients")
    void addPatient(@RequestBody Patient patient) {
        System.out.println("BODY " + patient);
        this.patientRepository.save(patient);
    }
}