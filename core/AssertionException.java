
package core;

import sorting.Sorter;

public class AssertionException extends RuntimeException {

    private final Sorter sorter;
    private final String testName;

    public AssertionException(Sorter sorter, String testName, String message) {
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
