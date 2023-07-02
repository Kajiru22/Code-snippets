package io.everyonecodes.week2_properties.singapore_reconstruction.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Building {

    private String name;
    private LocalDate built;
    private boolean historic;

    public Building() {
    }

    public Building(String name, LocalDate built, boolean historic) {
        this.name = name;
        this.built = built;
        this.historic = historic;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public LocalDate getBuilt() {
        return built;
    }

    void setBuilt(LocalDate built) {
        this.built = built;
    }

    public boolean isHistoric() {
        return historic;
    }

    void setHistoric(boolean historic) {
        this.historic = historic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return isHistoric() == building.isHistoric() &&
                Objects.equals(getName(), building.getName()) &&
                Objects.equals(getBuilt(), building.getBuilt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBuilt(), isHistoric());
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", built=" + built +
                ", isHistoric=" + historic +
                '}';
    }
}

