package com.jimherold.datastructures.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Giben an array of integers, return a new array such that each element at index i of the new array is the product of
 * all the numbers in the original array except the one at i.
 */
public interface ProductAllOtherElements {

    public List<Integer> getProductOfAllOtherElements(List<Integer> elements);

}
