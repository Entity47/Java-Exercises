
import core.AssertionException;

import sorting.SortingTests;
import sorting.sort.InsertionSort;
import sorting.sort.SelectionSort;

class JavaExercises {
    public static void main(String[] args) {

        try {
            // Test insertion sorting
            InsertionSort insertionSort = new InsertionSort();
            SortingTests.testEmpty(insertionSort);
            SortingTests.testSingle(insertionSort);
            SortingTests.testDoubleAscending(insertionSort);
            SortingTests.testDoubleDescending(insertionSort);
            SortingTests.testOrderedAscending(insertionSort);
            SortingTests.testOrderedDescending(insertionSort);
            SortingTests.testUnordered(insertionSort);

            // Test selection sorting
            SelectionSort mergeSort = new SelectionSort();
            SortingTests.testEmpty(mergeSort);
            SortingTests.testSingle(mergeSort);
            SortingTests.testDoubleAscending(mergeSort);
            SortingTests.testDoubleDescending(mergeSort);
            SortingTests.testOrderedAscending(mergeSort);
            SortingTests.testOrderedDescending(mergeSort);
            SortingTests.testUnordered(mergeSort);

            printGreen("Passed all tests!");
        } catch (AssertionException e) {
            String message = "FAIL\t\t" + e.getTestName() + " - " + e.getSorter();
            printRed(message);

            String exceptionMessage = e.getMessage();
            if (exceptionMessage != null) {
                printRed(exceptionMessage);
            }
        }
    }

    private static void printGreen(String message) {
        System.out.println((char)27 + "[32m" + message + (char)27 + "[0m");
    }

    private static void printRed(String message) {
        System.out.println((char)27 + "[31m" + message + (char)27 + "[0m");
    }
}
