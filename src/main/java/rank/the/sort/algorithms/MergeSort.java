package rank.the.sort.algorithms;

public class MergeSort implements SortAlgorithm{

    /**
     * <strong>Mergesort algorithm.</strong>
     * <p>
     * Big O Notation:
     * <ul>
     *     <li>best: O (n log(n))</li>
     *     <li>average: O (n log(n))</li>
     *     <li>worst: O (n log(n))</li>
     * </ul>
     */
    @Override
    public void sort(int[] array) {
        // TODO
    }

    private void mergeSort(int[] array, int begin, int end) {
        if ((end - begin) <= 0) {
            return;
        }
        int mid = (begin + end) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);
        // TODO
    }


}
