package rank.the.sort.utils;

import rank.the.sort.algorithms.SortAlgorithm;

public class SortingTimer implements SortAlgorithm{

    SortAlgorithm algorithm;

    public SortingTimer(SortAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public int[] sort(int[] array) {
        long start = System.nanoTime();
        int[] result = algorithm.sort(array);
        long end = System.nanoTime();
        System.out.println((end - start) / (float) 1000 + "ms");
        return result;
    }
}
