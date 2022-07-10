package rank.the.sort.algorithms;

import rank.the.sort.utils.Printer;

import java.util.Arrays;

public class HeapSort implements SortAlgorithm {

    /**
     * <strong>Heapsort algorithm.</strong>
     * <p>
     * Big O Notation:
     * <ul>
     *     <li>best: O (n)</li>
     *     <li>average: O (n log(n))</li>
     *     <li>worst: O (n log(n))</li>
     * </ul>
     */
    @Override
    public void sort(int[] array) {
        heapSort(array);
    }

    private void heapSort(int[] array) {
        int size = array.length;
        while (size > 0) {
            heapefy(array, size);
            swap(array, 0, size - 1);
            size--;
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void heapefy(int[] heap, int size) {
        for (int i = size - 1; i >= 0; i--) {
            int parent = parent(i);
            if (isInsideBound(size, parent) && isBiggerThanParent(heap[i], heap[parent])) {
                swap(heap, i, parent);
            }
        }
    }

    private boolean isBiggerThanParent(int child, int parent) {
        return child > parent;
    }

    private boolean isInsideBound(int size, int parent) {
        return parent >= 0 && parent < size;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

}
