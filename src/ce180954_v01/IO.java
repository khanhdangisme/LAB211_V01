/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_v01;

import java.util.Scanner;

/**
 * V01 _ Random lucky number
 *
 * @author Le Khanh Dang _ CE180954 12/01/2004
 */
public class IO {

    Scanner sc = new Scanner(System.in);

    /**
     * Checks if the user input is a valid integer within the specified range.
     *
     * @param msg Message to prompt the user
     * @param max Maximum allowed value
     * @return A valid integer entered by the user
     */
    public int checkNumber(String msg, int max) {
        // Variable to store user input
        int dataUser;
        // Loop until valid input is received
        while (true) {
            try {
                // Display the prompt message
                System.out.print(msg);
                // Parse the user input to an integer
                dataUser = Integer.parseInt(sc.nextLine());
                // Check if the input is within the allowed range
                if (dataUser >= 0 && dataUser <= max) {
                    // Return valid input
                    return dataUser;
                } else {
                    // Error message for out-of-range input
                    System.out.println("Input must be between 0 and " + max + ".");
                }
                // Handle non-integer input
            } catch (NumberFormatException e) {
                // Error message for invalid format
                System.out.println("Input must be in correct format.");
            }
        }
    }

    /**
     * Prompts the user for a 'yes' or 'no' response and validates the input.
     *
     * @param msg Message to prompt the user
     * @return True if the user enters 'y' or 'yes', False if the user enters
     * 'n' or 'no'
     */
    public boolean getYesOrNoInput(String msg) {
        // Loop until valid input is received
        while (true) {
            // Display the prompt message
            System.out.print(msg);
            // Read and normalize user input
            String input = sc.nextLine().trim().toLowerCase();
            // Check for 'yes' responses
            if (input.equals("y") || input.equals("yes")) {
                return true;
            } // Check for 'no' responses
            else if (input.equals("n") || input.equals("no") || input.equals("co") || input.equals("khong")) {
                return false;
            } // Error message for invalid input
            else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }
}
