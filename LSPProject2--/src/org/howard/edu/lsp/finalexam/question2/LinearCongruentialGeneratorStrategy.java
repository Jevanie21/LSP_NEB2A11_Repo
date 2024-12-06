package org.howard.edu.lsp.finalexam.question2;

public class LinearCongruentialGeneratorStrategy implements RandomNumberStrategy {
    private long seed;

    public LinearCongruentialGeneratorStrategy(long seed) {
        this.seed = seed;
    }

    @Override
    public int generateRandomNumber(int upperBound) {
        // Linear Congruential Generator implementation
        // Adjust parameters as needed for better randomness
        //Random Number Generation:
        //https://www.baeldung.com/java-generating-random-numbers
        //https://www.geeksforgeeks.org/java-math-random-method-examples/
        //https://www.digitalocean.com/community/tutorials/java-generate-random-numbers
        //Strategy Pattern:
        //https://refactoring.guru/design-patterns/strategy
        //https://www.baeldung.com/java-strategy-pattern
        //https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
        //Singleton Pattern:
        //https://www.baeldung.com/java-singleton
        //https://refactoring.guru/design-patterns/singleton
        //https://www.geeksforgeeks.org/singleton-class-java/
        seed = (seed * 16807 + 2147483647) % 2147483647;
        return (int) (seed % upperBound) + 1;
    }
}
