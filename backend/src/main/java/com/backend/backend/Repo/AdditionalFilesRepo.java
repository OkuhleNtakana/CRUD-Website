package com.backend.backend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.AdditionalFiles;

@Repository
public interface AdditionalFilesRepo extends JpaRepository<AdditionalFiles,Integer>{
    //List<AdditionalFiles> getByfkapplicantid(int fkapplicantid);
}
