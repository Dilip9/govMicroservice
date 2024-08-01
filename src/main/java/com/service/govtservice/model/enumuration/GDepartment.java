package com.service.govtservice.model.enumuration;

public enum GDepartment {
    CIVIL("CIVIL"),
    RAILWAYS("RAILWAYS"),
    POLITICS("POLITICS"),
    TEACHER("TEACHER"),
    POLICE("POLICE"),
    MILATRY("MILATRY");

    private String gDepartment;

    GDepartment(String gDepartment) {
        this.gDepartment = gDepartment;
    }
}
