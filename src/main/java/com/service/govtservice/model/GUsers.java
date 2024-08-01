package com.service.govtservice.model;


import com.service.govtservice.model.enumuration.GDepartment;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


public class GUsers {
    private Long Id;
    private String name;
    @Enumerated(EnumType.STRING)
    private GDepartment gDepartment;

    private String email;

    private String cNo;

    public GUsers(Long id, String name, GDepartment gDepartment, String email, String cNo) {
        Id = id;
        this.name = name;
        this.gDepartment = gDepartment;
        this.email = email;
        this.cNo = cNo;
    }
}
