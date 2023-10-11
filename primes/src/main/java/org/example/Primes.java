package org.example;

import java.util.ArrayList;
import java.util.List;

public class Primes {

    static List<Integer> primesSeries(Integer number) {
        List<Integer> primes = new ArrayList<>();
        primes.add(1);

        Integer currentNumber = 2;
        while (primes.size() < number) {
            if (isPrime(currentNumber, primes)) {
                primes.add(currentNumber);
            }
            currentNumber++;

        }

        return primes;

    }

    private static boolean isPrime(Integer currentNumber, List<Integer> primesBefore) {

        boolean canBeDivided = false;

        for (Integer primeBefore : primesBefore) {
            if (primeBefore != 1) {
                int lala = currentNumber % primeBefore;
                if (lala == 0) {
                    canBeDivided = true;
                    break;
                }
            }
        }

        return !canBeDivided;
    }
}
