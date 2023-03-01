package com.jimherold.datastructures.arrays;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductAllOtherElementsTest {

    @Test
    void bruteForceSucceeds() {
        ProductAllOtherElements productAllOtherElements = new BruteForceProductOfAllOtherElements();
        List<Integer> elements = List.of(1, 2, 3, 4, 5);
        List<Integer> actualProducts = productAllOtherElements.getProductOfAllOtherElements(elements);
        List<Integer> expectedProducts = List.of(120,60,40,30,24);
        Truth.assertThat(actualProducts).containsExactlyElementsIn(expectedProducts).inOrder();
    }

    @Test
    void cuteSucceeds() {
        ProductAllOtherElements productAllOtherElements = new CuteProductOfAllOtherElements();
        List<Integer> elements = List.of(1, 2, 3, 4, 5);
        List<Integer> actualProducts = productAllOtherElements.getProductOfAllOtherElements(elements);
        List<Integer> expectedProducts = List.of(120,60,40,30,24);
        Truth.assertThat(actualProducts).containsExactlyElementsIn(expectedProducts).inOrder();
    }
}