package rank.the.sort.utils;

import java.util.Random;

public abstract class ArrayGenerator {

    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max + 1 - min) + min;
        }
        return array;
    }

}
