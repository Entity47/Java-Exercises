
package core;

public class Printer {

    public static void printGreen(String message) {
        System.out.println((char)27 + "[32m" + message + (char)27 + "[0m");
    }

    public static void printRed(String message) {
        System.out.println((char)27 + "[31m" + message + (char)27 + "[0m");
    }
}
