package io.everyonecodes.week1_springbeans.fizzbuzz;

public class MultipleFinder {

    public MultipleFinder(int multiple) {
        this.multiple = multiple;
    }

    private final int multiple;

    public boolean isMultiple(int number) {
        return number % multiple == 0;
    }
}
