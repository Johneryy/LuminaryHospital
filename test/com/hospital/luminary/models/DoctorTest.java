package com.hospital.luminary.models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DoctorTest {
    private Doctor drJohn;
    private HealthProfessional Johnery;

    @BeforeEach
    void setUp() {
        drJohn = new Doctor("John");
        Johnery = new Nurse("Johnery");
    }
    @Test
    public void createHealthProfessionals() {
        assertEquals(HealthProfessionalType.DOCTOR, drJohn.getHealthProfessionalType());
        assertNotEquals(HealthProfessionalType.DOCTOR, Johnery.getHealthProfessionalType());
        assertEquals(HealthProfessionalType.NURSE, Johnery.getHealthProfessionalType());
        Johnery = new Pharmacist("Wimp");
        assertNotEquals(HealthProfessionalType.NURSE, Johnery.getHealthProfessionalType());
    }
    @Test
    void createPatient() {
        Patient eden = new Patient();
    }
}