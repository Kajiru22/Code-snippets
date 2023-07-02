package iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data;

import java.util.Objects;

public class Diagnosis {

    private String symptoms;
    private String name;


    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagnosis diagnosis = (Diagnosis) o;
        return Objects.equals(symptoms, diagnosis.symptoms) && Objects.equals(name, diagnosis.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symptoms, name);
    }
}
