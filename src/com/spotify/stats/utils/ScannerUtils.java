package com.spotify.stats.utils;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Reads an Integer safely. If the input provided is not a valid integer,
     * prompts the user to enter a valid number.
     *
     * @return Integer entered by the user.
     */
    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. It is not an Integer.");
                System.out.print("Please enter a number:");
            }
        }
        return number;
    }

    /**
     * Reads a Double safely. If the input provided is not a valid Double,
     * prompts the user to enter a valid number.
     *
     * @return Double entered by the user.
     */
    public static double readDouble() {
        double number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. It is not an Double.");
                System.out.print("Please enter a number:");
            }
        }
        return number;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
