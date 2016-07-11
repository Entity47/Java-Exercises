
package sorting.insertion;

import core.Assertions;

public class InsertionSortTests {

    public void testEmpty() {
        // arrange
        int[] input = new int[0];

        // act
        int[] result = InsertionSort.sort(input);

        // assert
        int[] expected = new int[0];
        Assertions.verify(expected, result);
    }

    public void testSingle() {
        // arrange
        int[] input = new int[] { 1 };

        // act
        int[] result = InsertionSort.sort(input);

        // assert
        int[] expected = new int[] { 1 };
        Assertions.verify(expected, result);
    }

    public void testOrderedAscending() {
        // arrange
        int[] input = new int[] { 1, 2, 3, 4, 5 };

        // act
        int[] result = InsertionSort.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(expected, result);
    }

    public void testOrderedDescending() {
        // arrange
        int[] input = new int[] { 5, 4, 3, 2, 1 };

        // act
        int[] result = InsertionSort.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(expected, result);
    }

    public void testUnordered() {
        // arrange
        int[] input = new int[] { 5, 1, 3, 2, 4 };

        // act
        int[] result = InsertionSort.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(expected, result);
    }
}
