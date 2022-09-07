package com.hospital.luminary.models;

public class Doctor  extends HealthProfessional{
    public Doctor(String name){
        super(name);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.DOCTOR;
    }
}
