package com.gabriel.algorithms.searching;

public final class BinarySearch {

    private BinarySearch() {
        throw new AssertionError("Utility class");
    }

    /**
     * Performs a binary search on a sorted array.
     *
     * <p>The array must be sorted in ascending order before calling this method.
     *
     * <p>Time Complexity:
     * <ul>
     *   <li>Best case: O(1)</li>
     *   <li>Average case: O(log n)</li>
     *   <li>Worst case: O(log n)</li>
     * </ul>
     *
     * <p>Space Complexity:
     * <ul>
     *   <li>O(1)</li>
     * </ul>
     *
     * @param array sorted array in ascending order
     * @param target value to search for
     * @return the index of the target, or -1 if not found
     * @throws IllegalArgumentException if the array is null
     */
    public static int search(int[] array, int target ) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == target) {
                return mid;
            }

            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
