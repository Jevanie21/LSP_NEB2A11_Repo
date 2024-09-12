package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordCounter {

    public static void main(String[] args) {

        String filePath = "src/org/howard/edu/lsp/assignment2/word.txt";

        Map<String, Integer> wordCounts = new HashMap<>();

        Pattern nonLetterPattern = Pattern.compile("[^a-zA-Z']+");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+");
                for (String word : words) {

                    word = nonLetterPattern.matcher(word).replaceAll("");

                    if (!word.isEmpty()) {

                        word = word.toLowerCase();


                        if (word.length() > 3) {
                            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        wordCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + "    " + entry.getValue()));
    }
}