package com.backend.backend.model;
import jakarta.persistence.*;

@Entity
public class JobApplied {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int jobAppliedId;

  public int getJobAppliedId() {
    return this.jobAppliedId;
  }

  public void setJobAppliedId(int jobAppliedId) {
    this.jobAppliedId = jobAppliedId;
  }
  
  private String Status;
  private Float Score;

  public Float getScore() {
    return this.Score;
  }

  public void setScore(Float Score) {
    this.Score = Score;
  }

  public String getStatus() {
    return this.Status;
  }

  public void setStatus(String Status) {
    this.Status = Status;
  }

}
