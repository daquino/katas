package com.refactify;


import com.refactify.Fizzbuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {

    @Test
    public void testFizzbuzzDisplaysNumberWhenEncounteringNormalNumber() {
        assertEquals("Fizzbuzz output should be 1.", "1", Fizzbuzz.play(1));
    }

    @Test
    public void testFizzbuzzDisplaysMultipleNumbersSeparatedByComma() {
        assertEquals("Fizzbuzz output should be 1, 2.", "1, 2", Fizzbuzz.play(2));
    }

    @Test
    public void testFizzbuzzDisplaysFizzForEveryEncounterWithNumberDivisibleByThree() {
        assertEquals("Fizzbuzz output should be 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz", "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz", Fizzbuzz.play(9));
    }

    @Test
    public void testFizzbuzzOutputsBuzzForEveryEncounterWithNumberDivisibleBy5() {
        assertEquals("Fizzbuzz output should be 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", Fizzbuzz.play(10));
    }

    @Test
    public void testFizzbuzzOutputsFizzbuzzForEveryEncounterWithNumberDivisibleBy3And5() {
        assertEquals("Fizzbuzz output should be 1, 2, Fizz, 4, Buzz, Fizz, 7,"
          + " 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz,"
          + " Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz",
          "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,"
          + " FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,"
          + " Fizz, 28, 29, FizzBuzz",
          Fizzbuzz.play(30));
    }

}
