package rank.the.sort.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortAlgorithmTest {

    static int[] ARRAY_01 = {1, 2, 3};
    static int[] ARRAY_02 = {1};
    static int[] ARRAY_03 = {};
    static int[] ARRAY_04 = {3, 2, 1};
    static int[] ARRAY_05 = {99, 76, 1, 59, 81, 100, 304, 254, 123, 5};
    static int[] ARRAY_06 = {5, 5, 4, 4, 4, 1, 1, 1, 3};
    static int[] ARRAY_07 = {9, 9, 9, 9, 9, 9};

    static int[] EXPECTED_01 = {1, 2, 3};
    static int[] EXPECTED_02 = {1};
    static int[] EXPECTED_03 = {};
    static int[] EXPECTED_04 = {1, 2, 3};
    static int[] EXPECTED_05 = {1, 5, 59, 76, 81, 99, 100, 123, 254, 304};
    static int[] EXPECTED_06 = {1, 1, 1, 3, 4, 4, 4, 5, 5};
    static int[] EXPECTED_07 = {9, 9, 9, 9, 9, 9};

    static Stream<Arguments> intArrayProvider() {
        return Stream.of(
                Arguments.of(ARRAY_01, EXPECTED_01),
                Arguments.of(ARRAY_02, EXPECTED_02),
                Arguments.of(ARRAY_03, EXPECTED_03),
                Arguments.of(ARRAY_04, EXPECTED_04),
                Arguments.of(ARRAY_05, EXPECTED_05),
                Arguments.of(ARRAY_06, EXPECTED_06),
                Arguments.of(ARRAY_07, EXPECTED_07)
        );
    }

    @ParameterizedTest
    @MethodSource("intArrayProvider")
    void quickSortTest(int[] array, int[] expected) {
        // arrange
        SortAlgorithm sortAlgorithm = new QuickSort();

        // act
        int [] result = sortAlgorithm.sort(array);

        // assert
        assertArrayEquals(expected, result);
    }

}
