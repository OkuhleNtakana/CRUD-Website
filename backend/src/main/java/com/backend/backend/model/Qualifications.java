package com.backend.backend.model;
import java.sql.Date;

import jakarta.persistence.*;
@Entity
public class Qualifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qualification_id;
    private String qualificatiionName;
    private Date dateObtained;

    //Getters
    public String GetQualificationName(){
        return this.qualificatiionName;
    }
    public Date GetQualificationDate(){
        return this.dateObtained;
    }
    public int getQualiId() {
        return this.qualification_id;
    }

    //Setters
    public void SetQualificationName(String qn){
        this.qualificatiionName=qn;
    }
    public void SetDate(Date date){
        this.dateObtained=date;
    }
    public void setQualiId(int qualiId) {
        this.qualification_id = qualiId;
    }


}
