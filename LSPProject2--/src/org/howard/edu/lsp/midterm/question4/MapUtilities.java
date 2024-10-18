package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * A utility class for operations on HashMaps.
 */
public class MapUtilities {
    /**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 The first HashMap to compare.
     * @param map2 The second HashMap to compare.
     * @return The number of common key/value pairs. Returns 0 if either map is empty.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check if either map is empty; return 0 if true.
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0; // Variable to count common key/value pairs.

        // Iterate through the entries of the first HashMap.
        for (HashMap.Entry<String, String> entry : map1.entrySet()) {
            // Check if the second HashMap contains the same key and value.
            if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                commonCount++; // Increment count if a match is found.
            }
        }

        return commonCount; // Return the total count of common key/value pairs.
    }
}
