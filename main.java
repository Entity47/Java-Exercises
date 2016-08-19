
import core.AssertionException;

import sorting.SortingTests;
import sorting.sort.InsertionSort;
import sorting.sort.SelectionSort;
import sorting.sort.MergeSort;

class JavaExercises {
    public static void main(String[] args) {

        // TODO: Simplify running of tests to prevent redundency

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
            printGreen("Success - Insertion Sort");

            // Test selection sorting
            SelectionSort selectionSort = new SelectionSort();
            SortingTests.testEmpty(selectionSort);
            SortingTests.testSingle(selectionSort);
            SortingTests.testDoubleAscending(selectionSort);
            SortingTests.testDoubleDescending(selectionSort);
            SortingTests.testOrderedAscending(selectionSort);
            SortingTests.testOrderedDescending(selectionSort);
            SortingTests.testUnordered(selectionSort);
            printGreen("Success - Selection Sort");

            // Test merge sorting
            MergeSort mergeSort = new MergeSort();
            SortingTests.testEmpty(mergeSort);
            SortingTests.testSingle(mergeSort);
            SortingTests.testDoubleAscending(mergeSort);
            SortingTests.testDoubleDescending(mergeSort);
            SortingTests.testOrderedAscending(mergeSort);
            SortingTests.testOrderedDescending(mergeSort);
            SortingTests.testUnordered(mergeSort);
            printGreen("Success - Merge Sort");

            printGreen("\nPASSED ALL TESTS!");
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
