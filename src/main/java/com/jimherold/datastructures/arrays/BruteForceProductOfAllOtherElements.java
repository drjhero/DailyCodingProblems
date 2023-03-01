package com.jimherold.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class BruteForceProductOfAllOtherElements implements ProductAllOtherElements {
    @Override
    public List<Integer> getProductOfAllOtherElements(List<Integer> elements) {
        List<Integer> productOfAllOtherElements = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            int product = 1;
            for (int j = 0; j < elements.size(); j++) {
                if (i!=j) {
                    product *= elements.get(j);
                }
            }
            productOfAllOtherElements.add(product);
        }
        return productOfAllOtherElements;
    }
}
