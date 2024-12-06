package org.howard.edu.lsp.finalexam.question2;

public class JavaRandomStrategy implements RandomNumberStrategy {
    private final Random random = new Random();

    @Override
    public int generateRandomNumber(int upperBound) {
        return random.nextInt(upperBound) + 1;
    }
}
