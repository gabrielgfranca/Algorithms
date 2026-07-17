package com.gabriel.application;

import com.gabriel.algorithms.searching.BinarySearch;
import com.gabriel.algorithms.searching.LinearSearch;
import com.gabriel.algorithms.sorting.SelectionSort;
import com.gabriel.benchmark.Benchmark;
import com.gabriel.utils.RandomCollectionGenerator;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] sortedArray = RandomCollectionGenerator.generateSorted(1_000_000);
        List<Integer> unsortedArray = RandomCollectionGenerator.generateList(10_000);

        IO.println(Benchmark.run(
                "Linear Search",
                () -> LinearSearch.search(sortedArray, 754_499)));
        // Execution Time: 2.087 ms

        IO.println(Benchmark.run(
                "Binary Search",
                () -> BinarySearch.search(sortedArray, 754_499)));
        // Execution Time: 0.182 ms

        IO.println(Benchmark.run(
                "Selection Sort",
                () -> SelectionSort.sort(unsortedArray)));
        // Execution Time: 34.839 ms
    }
}
