
package core;

import java.util.Arrays;

public class Assertions {

    public static void verify(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            throw new AssertionException(buildErrorMessage(Arrays.toString(expected), Arrays.toString(actual)));
        } else {
            for (int i = 0; i < expected.length; i++) {
                if (expected[i] != actual[i]) {
                    throw new AssertionException(buildErrorMessage(Arrays.toString(expected), Arrays.toString(actual)));
                }
            }
        }
    }

    private static String buildErrorMessage(String expected, String actual) {
        return "'" + expected + "' is not equal to\n'" + actual + "'";
    }
}
