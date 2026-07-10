package com.gabriel.application;

import com.gabriel.algorithms.searching.BinarySearch;
import com.gabriel.algorithms.searching.LinearSearch;
import com.gabriel.benchmark.Benchmark;
import com.gabriel.utils.RandomArrayGenerator;

public class Program {
    public static void main(String[] args) {
        int[] original = RandomArrayGenerator.generateSorted(1_000_000);

        IO.println(Benchmark.run(
                "Linear Search",
                () -> LinearSearch.search(original, 754_499)));
        // Execution Time: 2.087 ms

        IO.println(Benchmark.run(
                "Binary Search",
                () -> BinarySearch.search(original, 754_499)));
        // Execution Time: 0.182 ms
    }
}
