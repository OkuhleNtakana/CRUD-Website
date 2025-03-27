package com.backend.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.Repo.*;
import com.backend.backend.model.*;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
     private UserRepo userrep;
    @Autowired 
    private SkillsRepo skillsrepo;
    @Autowired 
    private AdditionalFilesRepo addrepo;
    @Autowired 
    private ApplicantRepo apprepo;
    @Autowired 
    private  JobPostingRepo postsrepo;
    @Autowired 
    private  QualificationsRepo qualisrepo;
    @Autowired 
    private  JobAppliedRepo jobapprepo;
     
    @Override
    public User saveUser(User user) {
        return userrep.save(user);
    }

    @Override
    public List<User> getAllUsers() {
       return userrep.findAll();
    }

    @Override
    public User getUser(String username) {
        return  userrep.findByUsername(username);
    }

    @Override
    public User UpdateUser(User user) {
        return userrep.updateUser(user);
    }

    @Override
    public void deleteAccount(int id) {
        userrep.deleteById(id);
    }

    @Override
    public boolean login(String username, String password) {
        return userrep.findByUsernameAndUserPassword(username, password).isPresent();
    }

    @Override
    public Applicant saveApplicant(Applicant applicant) {
          return apprepo.save(applicant);
    }   

    @SuppressWarnings("deprecation")
    @Override
    public Applicant getApplicant(int id) {
        return apprepo.getById(id);
    }

    @Override
    public List<Applicant> geApplicants() {
       return apprepo.findAll();
    }

    @Override
    public List<JobPosting> getJobs() {
        return postsrepo.findAll();
    }

    @SuppressWarnings("deprecation")
    @Override
    public JobPosting getJob(String id) {
        return postsrepo.getById(id);
    }

    @Override
    public JobApplied applicantApply(JobApplied apply) {
        return jobapprepo.save(apply);
    }

    @Override
    public List<JobApplied> GetJobApplied() {
        return jobapprepo.findAll();
    }

    @Override
    public AdditionalFiles addFile(AdditionalFiles file) {
       return addrepo.save(file);
    }

    @Override
    public Skills addSkills(Skills skills) {
        return skillsrepo.save(skills);
    }

    @Override
    public Qualifications addQualifications(Qualifications qualifications) {
        return qualisrepo.save(qualifications);
    }

    @Override
    public JobApplied updateJobApplied(JobApplied uJobApplied) {
        return jobapprepo.updateJob(uJobApplied);
    }

    @Override
    public List<Skills> getSkills() {
        return skillsrepo.findAll();
    }

    @Override
    public List<Qualifications> getQualificationsApplicantId(int id) {
        return qualisrepo.getByApplicant_Id(id);
    }
   
    @Override
    public List<Qualifications> getQualificationsJobsId(int id) {
        return qualisrepo.getByJobPosting_Id(id);
    }
    @Override
    public List<Qualifications> getQualifications()
    {
        return qualisrepo.findAll();
    }


 
    @Override
    public List<AdditionalFiles> getAdditionalFilesId(int id) {
       return addrepo.getByApplicant_Id(id);
    }

  
    @Override
    public List<Skills> getSkillsJobsId(int id) {
        return skillsrepo.getByJobPosting_Id(id);
    }
  
   @Override
   public List<Skills> getSkillsApplicantId(int id) {
       return skillsrepo.getByApplicant_Id(id);
    }

@Override
public Applicant UpdateApplicant(Applicant applicant) {
   return apprepo.updateApplicant(applicant);
}

@Override
public List<JobApplied> GetJobAppliedApplicantId(int id) {
    return jobapprepo.getByApplicant_Id(id);
}

@Override
public List<JobApplied> GetJobAppliedJobId(int id) {
    return jobapprepo.getByJobPosting_Id(id);
}
}
  
