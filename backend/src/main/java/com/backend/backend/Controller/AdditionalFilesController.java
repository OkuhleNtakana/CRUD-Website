package com.backend.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.Service.UserService;
import com.backend.backend.model.AdditionalFiles;

@RestController
@RequestMapping("/Files")
@CrossOrigin 
public class AdditionalFilesController {
  @Autowired
    private UserService userService;

    @PostMapping("/add")
    public AdditionalFiles addFiles(@RequestBody AdditionalFiles entity) {
        return userService.addFile(entity);
    }
    
    @GetMapping("/getQualiId/{id}")
    public List<AdditionalFiles> getAdditionalFilesId(@RequestParam int id) {
        return userService.getAdditionalFilesId(id);
    }
}
