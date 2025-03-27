package com.backend.backend.Repo;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.model.Skills;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Integer>{
    List<Skills> getByApplicant_Id(int applicantid);
    List<Skills> getByJobPosting_Id(int jobpostingid);
}
