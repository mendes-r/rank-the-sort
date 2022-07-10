package rank.the.sort.algorithms;

public class QuickSort implements SortAlgorithm {

    /**
     * <strong>Quicksort algorithm.</strong>
     * <p>
     * Big O Notation:
     * <ul>
     *     <li>best: O (n log(n))</li>
     *     <li>average: O (n log(n))</li>
     *     <li>worst: O (n^2)</li>
     * </ul>
     */
    @Override
    public int[] sort(int[] array) {
        int size = array.length;
        quickSort(array, 0, size - 1);
        return array;
    }

    private void quickSort(int[] array, int begin, int end) {
        if (begin <= end) {
            int pivot = begin;

            for (int i = begin; i < end; i++) {
                if (array[i] < array[end]) {
                    switchElement(array, pivot, i);
                    pivot ++;
                }
            }

            switchElement(array, pivot, end);
            quickSort(array, pivot + 1, end);
            quickSort(array, begin, pivot - 1);
        }
    }

    private void switchElement(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
