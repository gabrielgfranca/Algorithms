package com.gabriel.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public final class SelectionSort {

    private SelectionSort() {
        throw new AssertionError("Utility class");
    }

    /**
     * Performs a selection sort on an array.
     *
     * <p>This implementation follows the algorithm presented in the book.
     * A temporary list is used so the smallest element can be removed
     * after each iteration.
     *
     * <p>Time Complexity:
     * <ul>
     *   <li>Best case: O(n²)</li>
     *   <li>Average case: O(n²)</li>
     *   <li>Worst case: O(n²)</li>
     * </ul>
     *
     * <p>Space Complexity:
     * <ul>
     *   <li>O(n)</li>
     * </ul>
     *
     * @param array array to be sorted
     * @return a new sorted array
     * @throws IllegalArgumentException if the array is null
     */
    public static List<Integer> sort(List<Integer> array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        List<Integer> newArray = new ArrayList<>(array.size());

        while (!array.isEmpty()) {
            int smallestIndex = findSmallest(array);
            newArray.add(array.remove(smallestIndex));
        }

        return newArray;
    }

    /**
     * Searches for the smallest element in a list.
     *
     * @param list list to be searched
     * @return index of the smallest element
     */
    private static int findSmallest(List<Integer> list) {
        int smallest = list.getFirst();
        int smallestIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}