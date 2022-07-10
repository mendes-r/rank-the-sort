package rank.the.sort;

import rank.the.sort.algorithms.HeapSort;
import rank.the.sort.algorithms.MergeSort;
import rank.the.sort.algorithms.QuickSort;
import rank.the.sort.utils.ArrayUtils;
import rank.the.sort.utils.SortingTimer;

class Application {

  public static void main(String[] args) {
    int[] array = ArrayUtils.generate(4000, 0, 299);
    System.out.println("QuickSort: ");
    new SortingTimer(new QuickSort()).sort(array);
    System.out.println("HeapSort: ");
    new SortingTimer(new HeapSort()).sort(array);
    System.out.println("MergeSort: ");
    new SortingTimer(new MergeSort()).sort(array);
  }

}