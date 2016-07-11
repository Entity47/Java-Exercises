
import sorting.insertion.InsertionSortTests;
import core.AssertionException;

class JavaExercises {
    public static void main(String[] args) {

        try {
            InsertionSortTests sortTests = new InsertionSortTests();
            sortTests.testEmpty();
            sortTests.testSingle();
            sortTests.testDoubleAscending();
            sortTests.testDoubleDescending();
            sortTests.testOrderedAscending();
            sortTests.testOrderedDescending();
            sortTests.testUnordered();
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
