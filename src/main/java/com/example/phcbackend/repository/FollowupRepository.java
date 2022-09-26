package com.example.phcbackend.repository;
import java.util.List;

import java.util.Optional;
import com.example.phcbackend.model.Followup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowupRepository extends JpaRepository<Followup, Long>{
    Optional<Followup> findByFollowupId(Long followupId);
    List<Followup> findBySamId(String samId);
}