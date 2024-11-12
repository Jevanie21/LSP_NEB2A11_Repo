package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    // Default Constructor
    public IntegerSet() {}

    // Constructor to pass in an already initialized set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    // Clears the internal representation of the set.
    public void clear() {
        set.clear();
    }

    // Returns the length of the set.
    public int length() {
        return set.size();
    }

    // Checks if two sets are equal, regardless of order.
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    // Returns true if the set contains the specified value.
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set. Assumes non-empty set.
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        int max = set.get(0);
        for (int num : set) {
            if (num > max) max = num;
        }
        return max;
    }

    // Returns the smallest item in the set. Assumes non-empty set.
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        int min = set.get(0);
        for (int num : set) {
            if (num < min) min = num;
        }
        return min;
    }

    // Adds an item to the set or does nothing if it's already present.
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set if it exists.
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Performs union with another IntegerSet.
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
    }

    // Performs intersection with another IntegerSet.
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Performs difference (set1 - set2).
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Checks if the set is empty.
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Returns a string representation of the set.
    @Override
    public String toString() {
        return set.toString();
    }
}
