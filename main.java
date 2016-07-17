
import core.AssertionException;

import sorting.SortingTests;
import sorting.sort.InsertionSort;
import sorting.sort.MergeSort;

class JavaExercises {
    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();

        try {
            // Test insertion sorting
            SortingTests.testEmpty(insertionSort);
            SortingTests.testSingle(insertionSort);
            SortingTests.testDoubleAscending(insertionSort);
            SortingTests.testDoubleDescending(insertionSort);
            SortingTests.testOrderedAscending(insertionSort);
            SortingTests.testOrderedDescending(insertionSort);
            SortingTests.testUnordered(insertionSort);

            // Test merge sorting
            SortingTests.testEmpty(mergeSort);
            SortingTests.testSingle(mergeSort);
            SortingTests.testDoubleAscending(mergeSort);
            SortingTests.testDoubleDescending(mergeSort);
            SortingTests.testOrderedAscending(mergeSort);
            SortingTests.testOrderedDescending(mergeSort);
            SortingTests.testUnordered(mergeSort);
        } catch (AssertionException e) {
            String message = "Failed: " + e.getClass().getName();
            String exceptionMessage = e.getMessage();
            if (exceptionMessage != null) {
                message += "\n" + e.getMessage();
            }
            System.out.println(message);
        }

    }
}
