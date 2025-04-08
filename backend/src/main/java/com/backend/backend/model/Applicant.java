package com.backend.backend.model;

import java.util.List;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("Applicant")
public class Applicant extends User{

    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkapplicantid",referencedColumnName = "user_id")
    private List<Skills> skills;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkapplicantid",referencedColumnName = "user_id")
    private List<Qualifications> qualifications;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkapplicantid",referencedColumnName = "user_id")
    private List<JobApplied> jobApplieds;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fkapplicantid",referencedColumnName = "user_id")
    private List<AdditionalFiles> AdditionalFiles;

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
