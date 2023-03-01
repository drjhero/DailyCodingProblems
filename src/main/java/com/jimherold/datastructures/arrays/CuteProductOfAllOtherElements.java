package com.jimherold.datastructures.arrays;

import java.util.List;
import java.util.stream.Collectors;

public class CuteProductOfAllOtherElements implements ProductAllOtherElements {
    @Override
    public List<Integer> getProductOfAllOtherElements(List<Integer> elements) {
        int productAll = elements.stream().reduce(1 , (a, b) -> a * b);
        return elements.stream().map(x -> productAll / x).collect(Collectors.toList());
    }
}
