package rank.the.sort.algorithms;

public class MergeSort implements SortAlgorithm {

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
    public int[] sort(int[] array) {
        int size = array.length;
        if (size == 0) return array;
        return mergeSort(array, 0, size - 1);
    }

    private int[] mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            int[] leftArray = mergeSort(array, left, mid);
            int[] rightArray = mergeSort(array, mid + 1, right);
            return merge(leftArray, rightArray);
        }
        return new int[]{array[left]};
    }

    private int[] merge(int[] left, int[] right) {

        int leftLength = left.length;
        int rightLength = right.length;
        int[] result = new int[leftLength + rightLength];
        boolean flag = true;
        int l = 0;
        int r = 0;
        int i = 0;

        while (flag) {
            if (left[l] < right[r]) {
                result[i] = left[l];
                l++;
            } else {
                result[i] = right[r];
                r++;
            }
            i++;
            flag = l < leftLength && r < rightLength;
        }

        if (l < leftLength) {
            for (int li = l; li < leftLength; li++) {
                result[i] = left[li];
                i++;
            }
        } else {
            for (int ri = r; ri < rightLength; ri++) {
                result[i] = right[ri];
                i++;
            }
        }

        return result;
    }

}
