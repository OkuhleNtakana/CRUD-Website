package com.backend.backend.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.Service.UserService;
import com.backend.backend.model.Qualifications;

@RestController
@RequestMapping("/quali")
@CrossOrigin 
public class QualificationsController {
    @Autowired
    private UserService userService;

    @PostMapping("/addQuali")
    public Qualifications addQuali(@RequestBody Qualifications entity) {
        return userService.addQualifications(entity);
    }
    @GetMapping("/getQuali")
    public List<Qualifications> getQuali() {
        return userService.getQualifications();
    }
    @GetMapping("/getQualiId/{id}")
    public String getQualiId(@RequestParam int id) {
        return new String();
    }

    @GetMapping("/getQualiApplicantId/{id}")
    public List<Qualifications> getSkillsApplicantId(@RequestParam int id) {
        return userService.getQualificationsApplicantId(id);
    }
    @GetMapping("/getQualiJobPostingId/{id}")
    public List<Qualifications> getQualiJobPostingId(@RequestParam int id) {
        return userService.getQualificationsJobsId(id);
    }
    
    
}
