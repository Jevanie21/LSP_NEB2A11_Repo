package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {}

    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    public int getRandomNumber(int upperBound) {
        if (strategy == null) {
            throw new IllegalStateException("No random number strategy set");
        }
        return strategy.generateRandomNumber(upperBound);
    }
}