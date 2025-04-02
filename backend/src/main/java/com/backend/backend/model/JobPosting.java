package com.backend.backend.model;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;
@Entity
public class JobPosting {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int jobPosting_id;

   public int getjobPosting_id() {
       return this.jobPosting_id;
   }

   public void setjobPosting_id(int jobPost_id) {
       this.jobPosting_id = jobPost_id;
   }

    private String jobTitle;
    private String jobLocation;
    private String jobDescription;
    private Date jobDeadLine;
    private float salary;
    private String jobSector;

     //Table Relationships and Linking
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_jobPosting_id",referencedColumnName = "jobPosting_id")
    private List<Skills> skills;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_jobPosting_id",referencedColumnName = "jobPosting_id")
    private List<Qualifications> quali;

  
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_jobPost_id",referencedColumnName = "jobPosting_id")
    private List<JobApplied> jobApplieds;

    //Getters
    public List<Skills> getSkills() { 
        return this.skills;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public String getJobSector() {
        return this.jobSector;
    }
    
    public float getSalary() {
        return this.salary;
    }
    public Date getJobDeadLine() {
        return this.jobDeadLine;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
    public String getJobLocation() {
        return this.jobLocation;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }  
    public List<Qualifications> getQuali() {
        return this.quali;
    }


     //Setters
    public void setQuali(List<Qualifications> quali) {
        this.quali = quali;
    }
    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public void setJobDeadLine(Date jobDeadLine) {
        this.jobDeadLine = jobDeadLine;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setJobSector(String jobSector) {
        this.jobSector = jobSector;
    }
    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

}
