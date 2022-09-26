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

import com.example.phcbackend.model.Followup;
import com.example.phcbackend.repository.FollowupRepository;

@RestController
@CrossOrigin
public class FollowupController {

    // standard constructors
    
    private final FollowupRepository followupRepository;

    @Autowired
    public FollowupController(FollowupRepository followupRepository) {
        this.followupRepository = followupRepository;
    }

    @GetMapping("/followups/{samId}")
    public List<Followup> getFollowupsBySamId(@PathVariable String samId) {
        System.out.println("HI SAM" + samId);
        return (List<Followup>) this.followupRepository.findBySamId(samId);
    }

    @GetMapping("/followup/{followupId}")
    public Optional<Followup> getFollowupById(@PathVariable Long followupId) {
        System.out.println("HI " + followupId);
        return this.followupRepository.findByFollowupId(followupId);
    }

    @PostMapping("/add-followup")
    void addFollowup(@RequestBody Followup f) {
        this.followupRepository.save(f);
    }
}