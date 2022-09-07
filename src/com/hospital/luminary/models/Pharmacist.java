package com.hospital.luminary.models;

public class Pharmacist extends HealthProfessional{
    public Pharmacist(String name) {
        super(name);
    }

    @Override
    public HealthProfessionalType getHealthProfessionalType() {
        return HealthProfessionalType.PHARMACIST;
    }
}
