package io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes;

import java.util.Objects;

public class Patient {

    private String name;
    private String symptoms;
    private String uuid;

    public Patient(String name, String symptoms, String uuid) {
        this.name = name;
        this.symptoms = symptoms;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(symptoms, patient.symptoms) && Objects.equals(uuid, patient.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, symptoms, uuid);
    }
}
