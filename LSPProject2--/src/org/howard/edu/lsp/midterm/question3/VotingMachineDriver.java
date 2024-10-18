package org.howard.edu.lsp.midterm.question3;

/**
 * A driver class to test the VotingMachine functionality.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        // Create a new instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // Add candidates to the voting machine
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // Cast votes for candidates
        vm.castVote("Alsobrooks");
        vm.castVote("Hogan");
        vm.castVote("Alsobrooks"); // Voting for Alsobrooks again

        // Print out the results of the voting
        System.out.println(vm); // Automatically calls toString() method
    }
}

