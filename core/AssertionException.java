
package core;

public class AssertionException extends RuntimeException {

    private final String testName;

    public AssertionException(String testName, String message) {
        super(message);
        this.testName = testName;
    }

    public String getTestName() {
        return this.testName;
    }
}
