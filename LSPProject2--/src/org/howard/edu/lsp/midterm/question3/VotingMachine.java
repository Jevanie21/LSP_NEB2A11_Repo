package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

/**
 * A class representing a voting machine that allows adding candidates
 * and casting votes for them.
 */
public class VotingMachine {
    // Final field to store candidates and their vote counts.
    private final HashMap<String, Integer> candidates;

    // Constructor to initialize the candidates HashMap.
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate with the specified name to the list.
     *
     * @param name The name of the candidate to be added.
     */
    public void addCandidate(String name) {
        // Initialize candidate votes to 0 if the candidate is being added for the first time.
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for the candidate with the specified name.
     *
     * @param name The name of the candidate to receive the vote.
     */
    public void castVote(String name) {
        // Increment the vote count for the candidate if they exist in the list.
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    /**
     * Returns a string representation of the candidates and the number of votes they received.
     *
     * @return A string containing the names and vote counts of all candidates.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate)
                    .append(": ")
                    .append(candidates.get(candidate))
                    .append(" votes\n");
        }
        return result.toString();
    }
}
