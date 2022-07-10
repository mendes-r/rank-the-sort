package rank.the.sort.utils;

public abstract class Printer {

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
