
package sorting;

import core.Assertions;
import core.AssertionException;
import core.Printer;
import sorting.Sorter;

public class SortingTests {

    public static void testSort(Sortable sorter) {

        try {
            testEmpty(sorter);
            testSingle(sorter);
            testDoubleAscending(sorter);
            testDoubleDescending(sorter);
            testOrderedAscending(sorter);
            testOrderedDescending(sorter);
            testUnordered(sorter);

            Printer.printGreen("Success - " + sorter.getClass().getName());
        } catch (AssertionException e) {
            String message = String.format("FAIL \t\t %s - %s", e.getTestName(), sorter.getClass().getName());
            Printer.printRed(message);

            String exceptionMessage = e.getMessage();
            if (exceptionMessage != null) {
                Printer.printRed(exceptionMessage);
            }
        }
    }

    private static void testEmpty(Sortable sorter) {
        // arrange
        int[] input = new int[0];

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[0];
        Assertions.verify(sorter, "testEmpty", input, expected, result);
    }

    private static void testSingle(Sortable sorter) {
        // arrange
        int[] input = new int[] { 1 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1 };
        Assertions.verify(sorter, "testSingle", input, expected, result);
    }

    private static void testDoubleAscending(Sortable sorter) {
        // arrange
        int[] input = new int[] { 1, 2 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1, 2 };
        Assertions.verify(sorter, "testDoubleAscending", input, expected, result);
    }

    private static void testDoubleDescending(Sortable sorter) {
        // arrange
        int[] input = new int[] { 2, 1 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1, 2 };
        Assertions.verify(sorter, "testDoubleDescending", input, expected, result);
    }

    private static void testOrderedAscending(Sortable sorter) {
        // arrange
        int[] input = new int[] { 1, 2, 3, 4, 5 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(sorter, "testOrderedAscending", input, expected, result);
    }

    private static void testOrderedDescending(Sortable sorter) {
        // arrange
        int[] input = new int[] { 5, 4, 3, 2, 1 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(sorter, "testOrderedDescending", input, expected, result);
    }

    private static void testUnordered(Sortable sorter) {
        // arrange
        int[] input = new int[] { 5, 1, 3, 2, 4 };

        // act
        int[] result = sorter.sort(input);

        // assert
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        Assertions.verify(sorter, "testUnordered", input, expected, result);
    }
}
