  package com.backend.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.Service.UserService;
import com.backend.backend.model.Applicant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/applicant")
@CrossOrigin
public class ApplicantController {
    @Autowired
    public UserService userservice;

    @PostMapping("/add")
    public Applicant addApplicant(@RequestBody Applicant entity) {
        return userservice.saveApplicant(entity);
    }
    @GetMapping("/getApplicant")
    public Applicant getApplicant(@RequestParam int id) {
        return userservice.getApplicant(id);
    }
    @GetMapping("/getAll")
    public List<Applicant> getAllApplicants() {
        return userservice.geApplicants();
    }
    /*@PostMapping("/update")
    public Applicant updateApplicant(@RequestBody Applicant entity) {
        return userservice.UpdateApplicant(entity);
    }*/
    
   
    

}
