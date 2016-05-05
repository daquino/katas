package com.refactify;

public class Fizzbuzz {
    public static String play(int number) {
        String output = "";
        for(int i = 1; i <= number; i++) {
            if(i % 15 == 0) {
                output += "FizzBuzz";
            }
            else if (i % 3 == 0) {
                output += "Fizz";
            }
            else if (i % 5 == 0) {
                output += "Buzz";
            }
            else {
                output += i;
            }
            output += i != number ? ", " : "";
        }
        return output;
    }
}
