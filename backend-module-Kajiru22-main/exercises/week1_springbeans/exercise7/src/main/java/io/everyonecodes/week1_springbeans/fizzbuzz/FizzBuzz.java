package io.everyonecodes.week1_springbeans.fizzbuzz;

public class FizzBuzz {

    public FizzBuzz(MultipleFinder multipleOfThree, MultipleFinder multipleOfFive) {
        this.multipleOfThree = multipleOfThree;
        this.multipleOfFive = multipleOfFive;
    }

    MultipleFinder multipleOfThree = new MultipleFinder(3);
    MultipleFinder multipleOfFive = new MultipleFinder(5);


    public FizzBuzz() {

    }

    public String apply(int number) {
        if (multipleOfThree.isMultiple(number) && multipleOfFive.isMultiple(number)) {
            return "FizzBuzz";
        } else if (multipleOfThree.isMultiple(number)) {
            return "Fizz";
        } else if (multipleOfFive.isMultiple(number)) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
