package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Random number (Java): " + service.getRandomNumber(100));

        // Use Linear Congruential Generator
        service.setStrategy(new LinearCongruentialGeneratorStrategy(System.currentTimeMillis()));
        System.out.println("Random number (LCG): " + service.getRandomNumber(100));
    }
}
