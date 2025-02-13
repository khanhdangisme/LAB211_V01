/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_v01;

/**
 * V01 _ Random lucky number
 *
 * @author Le Khanh Dang _ CE180954 12/01/2004
 */
public class CE180954_V01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an IO object to handle input and output operations
        IO io = new IO();
        // Create a MyProgram object to handle the game logic and statistics
        MyProgram game = new MyProgram();
        // Variable to determine if the user wants to play again
        boolean playAgain;

        do {
            // Call the play method to start a single round of the game
            game.play(io);
            // Ask the user if they want to play again using IO's getYesOrNoInput method
            playAgain = io.getYesOrNoInput("Do you want to play again? (y/n): ");
            // Continue playing as long as the user says 'yes'
        } while (playAgain);
        // Display the summary report after the user chooses to stop playing
        game.report();
        // Thank the user for playing and end the program
        System.out.println("Thank you for playing! Goodbye.");
    }

}
