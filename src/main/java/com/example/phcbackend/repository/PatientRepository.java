package com.example.phcbackend.repository;

import java.util.Optional;
import com.example.phcbackend.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
    Optional<Patient> findByRchId(String rchId);
}