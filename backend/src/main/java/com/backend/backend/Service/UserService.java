package com.backend.backend.Service;

import java.util.List;

import com.backend.backend.model.*;

public interface UserService {
    //User
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUser(String Username);
    public User UpdateUser(User user);
    public void deleteAccount(int id);
    public boolean login(String Username,String Password); 
    //Applicant
    public Applicant saveApplicant(Applicant applicant);
    public Applicant getApplicant(int id);
    public Applicant UpdateApplicant(Applicant app);
    public List<Applicant> geApplicants();
    //Files
    public AdditionalFiles addFile(AdditionalFiles file);
    public List<AdditionalFiles> getAdditionalFilesId(int id);
    //Skills
    public Skills addSkills(Skills skills);
    public List<Skills> getSkills();
    public List<Skills> getSkillsApplicantId(int id );
    public List<Skills> getSkillsJobsId(int id );
    //Qualifications
    public Qualifications addQualifications(Qualifications qualifications);
    public List<Qualifications> getQualifications();
    public List<Qualifications> getQualificationsApplicantId(int id);
    public List<Qualifications> getQualificationsJobsId(int id);
    //JobPosting
    public List<JobPosting> getJobs();
    public JobPosting getJob(String id);
    //Jobapplied
    public JobApplied applicantApply(JobApplied apply);
    public JobApplied updateJobApplied(JobApplied uJobApplied);
    public List<JobApplied> GetJobApplied();
    public List<JobApplied> GetJobAppliedApplicantId(int id);
    public List<JobApplied> GetJobAppliedJobId(int id);   
    
}
