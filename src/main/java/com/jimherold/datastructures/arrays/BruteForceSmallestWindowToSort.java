package com.jimherold.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BruteForceSmallestWindowToSort implements SmallestWindowToSort {
    @Override
    public Window findWindow(List<Integer> integers) {
        int startIndex = -1;
        int endIndex = -1;

        List<Integer> sortedIntegers = new ArrayList<>(integers);
        Collections.sort(sortedIntegers);
        for (int i = 0; i < integers.size(); i++) {
            if (sortedIntegers.get(i) != integers.get(i)) {
                if (startIndex == -1) {
                    startIndex = i;
                } else {
                    endIndex = i;
                }
            }
        }
        if (startIndex == -1) {
            startIndex = 0;
        }
        if (endIndex == -1) {
            endIndex = integers.size() - 1;
        }
        return new Window(startIndex, endIndex);
    }
}
