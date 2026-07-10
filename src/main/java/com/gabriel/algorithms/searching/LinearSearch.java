package com.gabriel.algorithms.searching;

public class LinearSearch {

    private LinearSearch() {
        throw new AssertionError("Utility class");
    }

    /**
     * Performs a linear search on an array.
     *
     * <p>Time Complexity:
     * <ul>
     *   <li>Best case: O(1)</li>
     *   <li>Average case: O(n)</li>
     *   <li>Worst case: O(n)</li>
     * </ul>
     *
     * <p>Space Complexity:
     * <ul>
     *   <li>O(1)</li>
     * </ul>
     *
     * @param array array to search through
     * @param target value to search for
     * @return the index of the target, or -1 if not found
     * @throws IllegalArgumentException if the array is null
     */
    public static int search(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
