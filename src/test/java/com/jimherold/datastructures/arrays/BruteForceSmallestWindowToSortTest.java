package com.jimherold.datastructures.arrays;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.Test;

import java.util.List;

class BruteForceSmallestWindowToSortTest {

    @Test
    public void exampleShouldSucceed() {
        List<Integer> exampleList = List.of(3, 7, 5, 6, 9);
        BruteForceSmallestWindowToSort bruteForceSmallestWindowToSort = new BruteForceSmallestWindowToSort();
        SmallestWindowToSort.Window actualWindow = bruteForceSmallestWindowToSort.findWindow(exampleList);
        SmallestWindowToSort.Window expectedWindow = new SmallestWindowToSort.Window(1, 3);
        Truth.assertThat(actualWindow.start).isEqualTo(expectedWindow.start);
        Truth.assertThat(actualWindow.end).isEqualTo(expectedWindow.end);
    }

}