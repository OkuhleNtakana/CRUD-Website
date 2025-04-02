package com.backend.backend.model;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicant_id;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_applicant_id",referencedColumnName = "applicant_id")
    private List<Skills> skills;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_applicant_id",referencedColumnName = "applicant_id")
    private List<Qualifications> qualifications;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_applicant_id",referencedColumnName = "applicant_id")
    private List<JobApplied> jobApplieds;

    //Getters
    public List<Qualifications> getQualifications() {
        return this.qualifications;
    }
   
    public List<JobApplied> getJobApplieds() {
        return this.jobApplieds;
    }
    public List<Skills> getSkills() { 
        return this.skills;
    }
    //Setters
    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }
    
    public void setJobApplieds(List<JobApplied> jobApplieds) {
        this.jobApplieds = jobApplieds;
    }

    public void setQualifications(List<Qualifications> qualifications) {
        this.qualifications = qualifications;
    }
    
   
 
}
