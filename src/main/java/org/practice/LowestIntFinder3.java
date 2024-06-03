package org.practice;

import java.util.*;

/**
 * Given a list of 100 integers, find the lowest int in range 100 - 1,000,000
 * which is NOT present in the given list.
 */
public class LowestIntFinder3 {

    public static void main(String[] args) {

        // create set 2
        List<Integer> set2 = new ArrayList<>();
        for (int i = 100; i <= 200; i++) {
            set2.add(i);
        }

        // shuffle set 2
        Collections.shuffle(set2);

        // assume we start (timing) with an unsorted set2
        long start = System.currentTimeMillis();

        // make one pass
        // step 1: find the highest value in set2

        int highVal = 0;
        for (Integer val: set2) {
            if (val > highVal) {
                highVal = val;
            }
        }

        // step 2: find the next highest value in set1
        for (int i = 100; i <= 1000000; i++) {
            if (i > highVal) {
                System.out.println(i);
                break;
            }
        }

        long stop = System.currentTimeMillis();
        long elapsed = stop - start;
        System.out.println(elapsed);

    }

}
