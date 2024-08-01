package com.service.govtservice.controller;

import com.service.govtservice.model.GUsers;
import com.service.govtservice.model.enumuration.GDepartment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/version", produces = "application/json")
@CrossOrigin(origins = "*")
public class GUsersController {

    @GetMapping(path = "/getAllUsers")
    public GUsers getGUsers(){
        GUsers gUsers = new GUsers(1L, "Ashutosh", GDepartment.CIVIL,"dilip95@gmail.com", "8880129176");
        return gUsers;
    }
}
