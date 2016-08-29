
package core;

import sorting.Sortable;

public class AssertionException extends RuntimeException {

    private final Sortable sorter;
    private final String testName;

    public AssertionException(Sortable sorter, String testName, String message) {
        super(message);
        this.sorter = sorter;
        this.testName = testName;
    }

    public String getSorter() {
        return this.sorter.getClass().getName();
    }

    public String getTestName() {
        return this.testName;
    }
}
