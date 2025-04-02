package com.backend.backend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.JobApplied;

@Repository
public interface JobAppliedRepo extends JpaRepository<JobApplied,Integer>{
    // JobApplied updateJob(JobApplied job);
    // List<JobApplied> getByApplicant_Id(int applicantid);
    // List<JobApplied> getByJobPosting_Id(int jobpostingid);
}
