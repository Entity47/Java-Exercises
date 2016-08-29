
import core.AssertionException;

import sorting.SortingTests;
import sorting.sort.InsertionSort;
import sorting.sort.SelectionSort;
import sorting.sort.MergeSort;

class JavaExercises {
    public static void main(String[] args) {

        try {
            // Test insertion sorting
            SortingTests.testSort(new InsertionSort());
            printGreen("Success - Insertion Sort");

            // Test selection sorting
            SortingTests.testSort(new SelectionSort());
            printGreen("Success - Selection Sort");

            // Test merge sorting
            SortingTests.testSort(new MergeSort());
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
