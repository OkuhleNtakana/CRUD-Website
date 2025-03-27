package com.backend.backend.model;

import jakarta.persistence.*;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skill_id")
    private int skill_id;

   //Getters
    private String skillName;

    public String GetSkillName(){
        return this.skillName;
    }
    public int getSkill_id() {
        return this.skill_id;
    }
    //Setters
    public void SetSkillName(String sk){
        this.skillName=sk;
    }
    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

}
