package com.refactify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.fill;
import static java.util.Arrays.stream;
import static java.util.Collections.emptyList;

public class PrimeFactorGenerator {
    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        return primeNumbersUpTo(number)
                 .filter(i -> number % i == 0)
                 .collect(Collectors.toList());
    }

    private static Stream<Integer> primeNumbersUpTo(int number) {
        boolean[] primes = new boolean[number+1];
        fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for(int i = 0; i < primes.length; i++) {
            if(primes[i]) {
                for(int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        return IntStream.range(0, primes.length)
                 .boxed()
                 .filter(i -> primes[i]);
    }
}
