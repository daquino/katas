package com.refactify;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;


public class PrimeFactorGeneratorTest {
    @Test
    public void testPrimeFactorsOfOne() {
        assertEquals(emptyList(), PrimeFactorGenerator.generate(1));
    }

    @Test
    public void testPrimeFactorsOfTwo() {
        assertEquals(asList(2), PrimeFactorGenerator.generate(2));
    }

    @Test
    public void testPrimeFactorsOfThree() {
        assertEquals(asList(3), PrimeFactorGenerator.generate(3));
    }

    @Test
    public void testPrimeFactorsOfFour() {
        assertEquals(asList(2), PrimeFactorGenerator.generate(4));
    }

    @Test
    public void testPrimeFactorsOfFive() {
        assertEquals(asList(5), PrimeFactorGenerator.generate(5));
    }

    @Test
    public void testPrimeFactorsOfSix() {
        assertEquals(asList(2, 3), PrimeFactorGenerator.generate(6));
    }

    @Test
    public void testPrimeFactorsOfSeven() {
        assertEquals(asList(7), PrimeFactorGenerator.generate(7));
    }

    @Test
    public void testPrimeFactorsOfEight() {
        assertEquals(asList(2), PrimeFactorGenerator.generate(8));
    }

    @Test
    public void testPrimeFactorsOfNine() {
        assertEquals(asList(3), PrimeFactorGenerator.generate(9));
    }

    @Test
    public void testPrimeFactorsOfTen() {
        assertEquals(asList(2, 5), PrimeFactorGenerator.generate(10));
    }
}
