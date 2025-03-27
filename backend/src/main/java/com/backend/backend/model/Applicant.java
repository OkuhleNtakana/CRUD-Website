package com.backend.backend.model;

import java.util.List;

import jakarta.persistence.*;
@Entity
//@DiscriminatorValue("APPLICANT")
public class Applicant extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="applicant_id")
    private int applicant_id;

    //Table Relationships and Linking
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;*/

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
    /*public User getUser() {
        return this.user;
    }*/
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
    /*public void setUser(User user) {
        this.user = user;
    }*/

    public void setJobApplieds(List<JobApplied> jobApplieds) {
        this.jobApplieds = jobApplieds;
    }

    public void setQualifications(List<Qualifications> qualifications) {
        this.qualifications = qualifications;
    }
    
   
 
}
