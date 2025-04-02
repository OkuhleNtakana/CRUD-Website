package com.backend.backend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.Qualifications;
@Repository
public interface QualificationsRepo extends JpaRepository<Qualifications,Integer>{
    // List<Qualifications> getByApplicant_Id(int applicantid);
    // List<Qualifications> getByJobPosting_Id(int jobpostingid);
}
