package com.backend.backend.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.Service.UserService;
import com.backend.backend.model.Skills;



@RestController
@RequestMapping("/skills")
@CrossOrigin 
public class SkillsController {

    @Autowired
    private UserService userService;

    @PostMapping("/addSkills")
    public Skills addSkills(@RequestBody Skills skill){
        return userService.addSkills(skill);
    }

    @GetMapping("/getSkills")
    public List<Skills> getSkills() {
        return userService.getSkills();
    }

    @GetMapping("/getSkillsApplicantId/{id}")
    public List<Skills> getSkillsApplicantId(@RequestParam int id) {
        return userService.getSkillsApplicantId(id);
    }
    @GetMapping("/getSkillsJobPostingId/{id}")
    public List<Skills> getSkillsJobPostingId(@RequestParam int id) {
        return userService.getSkillsJobsId(id);
    }

}
