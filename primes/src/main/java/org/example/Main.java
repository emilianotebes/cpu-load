package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Afuera!");
        } else {
            try {
                int numberOfElements = Integer.parseInt(args[0]);
                List<Integer> integers = Primes.primesSeries(numberOfElements);
                integers.forEach(number -> System.out.print(number + ","));
            } catch (RuntimeException runtimeException) {
                System.out.println("ERROR: " + runtimeException.getMessage());
            }
        }
    }
}