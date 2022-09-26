package com.example.phcbackend.repository;
import java.util.List;

import java.util.Optional;
import com.example.phcbackend.model.FollowupSchedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowupScheduleRepository extends JpaRepository<FollowupSchedule, Long>{
    Optional<FollowupSchedule> findByFollowupScheduleId(Long followupId);
    List<FollowupSchedule> findBySamId(String samId);
}