package com.backend.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.backend.Service.UserService;
import com.backend.backend.model.JobPosting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/jobPost")
@CrossOrigin
public class JobPostingController {
     @Autowired
    private UserService serve;
    @GetMapping("getJob")
    public JobPosting getJob(@RequestParam int param) {
        return serve.getJob(param);
    }
    @GetMapping("/getJobs")
    public List<JobPosting> getJobs() {
        return serve.getJobs();
    }
    
    
}
