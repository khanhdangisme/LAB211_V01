/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_v01;

import java.util.Random;

/**
 * V01 _ Random lucky number
 *
 * @author Le Khanh Dang _ CE180954 12/01/2004
 */
public class MyProgram {

    // Random object to generate random numbers
    Random random = new Random();
    // Maximum value for the lucky number
    private final int Maximum = 10;
    // The fewest number of guesses in a single game
    private int bestGame;
    // Total number of games played
    private int totalGames;
    // Average guesses per game
    private double guessAvg;
    // Total number of guesses made
    private int guessTotal;
    // The lucky number to guess
    private int luckyNumber;

    /**
     * Constructor for initializing the game statistics.
     */
    public MyProgram() {
        // Set bestGame to a very large value initially
        this.bestGame = Integer.MAX_VALUE;
        this.totalGames = 0;
        this.guessTotal = 0;
    }

    /**
     * The main logic for playing the lucky number game.
     *
     * @param io An IO object for input and output operations
     */
    public void play(IO io) {
        // Number of guesses in the current game
        int guesses = 0;
        // Flag to check if the user has guessed the number
        boolean guessedCorrectly = false;
        // Generate a random lucky number
        luckyNumber = random.nextInt(Maximum) + 1;
        System.out.println("\nA new lucky number has been generated. Try to guess it!");

        // Loop until the user guesses the lucky number
        while (!guessedCorrectly) {
            // Get user input
            int dataUser = io.checkNumber("Enter your guess: ", Maximum);
            // Increment the number of guesses
            guesses++;

            // Check if the guess is too high.
            if (dataUser > luckyNumber) {
                System.out.println("The lucky number is smaller than the number you predicted.");
            } // Check if the guess is too low.
            else if (dataUser < luckyNumber) {
                System.out.println("The lucky number is bigger than you expected.");
            } // User guessed the lucky number.
            else {
                System.out.println("Congratulations! You guessed the lucky number correctly after " + guesses + " guesses.");
                // Mark the game as successfully guessed
                guessedCorrectly = true;
            }
        }
        // Increment the total number of games played
        totalGames++;
        // Add the guesses from this game to the total guesses
        guessTotal += guesses;
        // Update the best game if this game is better
        bestGame = Math.min(bestGame, guesses);
    }

    /**
     * Report the game summary after the player finishes playing.
     */
    public void report() {
        // Calculate the average guesses per game
        guessAvg = (double) guessTotal / totalGames;

        System.out.println("\nGAME SUMMARY:");
        // Total games played
        System.out.println("Total games played: " + totalGames);
        // Total guesses made
        System.out.println("Total guesses made: " + guessTotal);
        // Average guesses
        System.out.printf("Average guesses per game: %.2f \n", guessAvg);
        // Best game
        System.out.println("Best game (fewest guesses): " + bestGame);
    }
}
