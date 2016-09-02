
import sorting.SortingTests;
import sorting.sort.InsertionSort;
import sorting.sort.SelectionSort;
import sorting.sort.MergeSort;
import sorting.sort.QuickSort;

class JavaExercises {
    public static void main(String[] args) {

        SortingTests.testSort(new InsertionSort());
        SortingTests.testSort(new SelectionSort());
        SortingTests.testSort(new MergeSort());
        SortingTests.testSort(new QuickSort());
    }
}
