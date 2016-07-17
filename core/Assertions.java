
package core;

import java.util.Arrays;

public class Assertions {

    public static void verify(String testDescription, int[] input, int[] expected, int[] actual) {

        if (expected.length != actual.length) {
            throw new AssertionException(buildErrorMessage(testDescription, input, expected, actual));
        } else {
            for (int i = 0; i < expected.length; i++) {
                if (expected[i] != actual[i]) {
                    throw new AssertionException(buildErrorMessage(testDescription, input, expected, actual));
                }
            }
        }
    }

    private static String buildErrorMessage(String testDescription, int[] input, int[] expected, int[] actual) {
        String inputStr = Arrays.toString(input);
        String expectedStr = Arrays.toString(expected);
        String actualStr = Arrays.toString(actual);

        return testDescription + "\n" +
            "input:\t\t" + inputStr + "\n" +
            "output:\t\t" + actualStr + "\n" +
            "expected:\t" + expectedStr;
    }
}
