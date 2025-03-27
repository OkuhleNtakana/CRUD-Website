package com.backend.backend.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.Service.UserService;
import com.backend.backend.model.JobApplied;


@RestController
@RequestMapping("/jobapplied")
@CrossOrigin
public class JobAppliedController {

    @Autowired
    private UserService serve;

    @GetMapping("/getall")
    public List<JobApplied> getAll() {
        return serve.GetJobApplied();
    }
    @PostMapping("/applicantApply")
    public JobApplied applicantApply(@RequestBody JobApplied entity) {
        return serve.applicantApply(entity);
    }
    @PutMapping("/updateJobApplied")
    public JobApplied updateJobApplied(@RequestBody JobApplied entity) {
        return serve.updateJobApplied(entity);
    }
    @GetMapping("GetJobAppliedApplicantId")
    public List<JobApplied> GetJobAppliedApplicantId(@RequestParam int id) {
        return serve.GetJobAppliedApplicantId(id);
    }
    @GetMapping("GetJobAppliedJobId")
    public List<JobApplied> GetJobAppliedJobId(@RequestParam int  id) {
        return serve.GetJobAppliedJobId(id);
    }
    
    
}
