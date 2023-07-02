package io.everyonecodes_week5_nosql.the_final_countdown.Data;

import java.util.Objects;

public class Accumulation {

    private String id;
    private int times;

    public Accumulation(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accumulation that = (Accumulation) o;
        return times == that.times && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, times);
    }

    @Override
    public String toString() {
        return "Accumulation{" +
                "id='" + id + '\'' +
                ", times=" + times +
                '}';
    }
}
