package com.backend.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant,Integer>{
   // Applicant updateApplicant(Applicant applicant);
}
