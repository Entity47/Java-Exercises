
package core;

import java.util.Arrays;
import sorting.Sorter;

public class Assertions {

    public static void verify(Sorter sorter, String testName, int[] input, int[] expected, int[] actual) {

        if (expected.length != actual.length) {
            throw new AssertionException(sorter, testName, buildErrorMessage(input, expected, actual));
        } else {
            for (int i = 0; i < expected.length; i++) {
                if (expected[i] != actual[i]) {
                    throw new AssertionException(sorter, testName, buildErrorMessage(input, expected, actual));
                }
            }
        }
    }

    private static String buildErrorMessage(int[] input, int[] expected, int[] actual) {
        String inputStr = Arrays.toString(input);
        String expectedStr = Arrays.toString(expected);
        String actualStr = Arrays.toString(actual);

        return "input:\t\t" + inputStr + "\n" +
            "output:\t\t" + actualStr + "\n" +
            "expected:\t" + expectedStr;
    }
}
