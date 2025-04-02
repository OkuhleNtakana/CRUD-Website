package com.backend.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.JobPosting;

@Repository
public interface JobPostingRepo extends JpaRepository<JobPosting,Integer>{
    
}
