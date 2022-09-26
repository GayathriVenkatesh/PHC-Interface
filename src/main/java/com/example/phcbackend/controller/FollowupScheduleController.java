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

import com.example.phcbackend.model.FollowupSchedule;
import com.example.phcbackend.repository.FollowupScheduleRepository;

@RestController
@CrossOrigin
public class FollowupScheduleController {

    // standard constructors
    
    private final FollowupScheduleRepository followupScheduleRepository;

    @Autowired
    public FollowupScheduleController(FollowupScheduleRepository followupScheduleRepository) {
        this.followupScheduleRepository = followupScheduleRepository;
    }

    @GetMapping("/followups/{samId}")
    public List<FollowupSchedule> getFollowupScheduleBySamId(@PathVariable String samId) {
        return (List<FollowupSchedule>) this.followupScheduleRepository.findBySamId(samId);
    }

    @GetMapping("/followup-schedule/{followupScheduleId}")
    public Optional<FollowupSchedule> getFollowupScheduleById(@PathVariable Long followupScheduleId) {
        return this.followupScheduleRepository.findByFollowupScheduleId(followupScheduleId);
    }

    @PostMapping("/add-followup-schedule")
    void addFollowup(@RequestBody FollowupSchedule f) {
        this.followupScheduleRepository.save(f);
    }
}