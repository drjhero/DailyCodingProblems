package com.jimherold.datastructures.arrays;

import java.util.List;

public interface SmallestWindowToSort {
    public class Window {
        int start;
        int end;

        public Window(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public Window findWindow(List<Integer> integers);
}
