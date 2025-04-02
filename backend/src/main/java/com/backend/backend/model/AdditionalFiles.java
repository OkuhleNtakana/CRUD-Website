package com.backend.backend.model;

import jakarta.persistence.*;

@Entity
public class AdditionalFiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int additional_id;

    public int getAdditional_id() {
        return this.additional_id;
    }

    public void setAdditional_id(int additional_id) {
        this.additional_id = additional_id;
    }

    private String fileName;
    private String filePath;

   
    //Getters
    public String GetFileName(){
        return this.fileName;
    }
    public String GetFilePath(){
        return this.filePath;
    }
   

    //Setters
    public void SetFileName(String filename){
        this.fileName=filename;
    }
    public void SetFilePath(String filepath){
        this.filePath=filepath;
    }
}
