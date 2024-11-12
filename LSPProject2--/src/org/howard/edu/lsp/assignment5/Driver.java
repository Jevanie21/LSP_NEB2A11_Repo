package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment6.IntegerSet;

public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1: " + set1);
        System.out.println("Smallest value in Set1: " + set1.smallest());
        System.out.println("Largest value in Set1: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2: " + set2);

        set1.union(set2);
        System.out.println("Union of Set1 and Set2: " + set1);

        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1);

        set1.diff(set2);
        System.out.println("Difference (Set1 - Set2): " + set1);

        System.out.println("Is Set1 empty? " + set1.isEmpty());
    }
}
