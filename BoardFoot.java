/*
* This program checks how long wood needs to be one board foot long
*
* @author  Emmanuel.FN
* @version 1.0
* @since   2024-03-14
*/

import java.util.Scanner;

/**
* This is the standard "BoardFoot" program.
*/
final class BoardFoot {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

     /**
    * Calculates the length of a board foot based on its width and height.
    *
    * @param boardWidthFloat  The width of the board in inches.
    * @param boardHeightFloat The height of the board in inches.
    * @return The length of the board foot.
    */

    static float checkBoardLength(float boardWidthFloat, float boardHeightFloat) {
        final float boardFoot = 144;
        final float boardLength = boardFoot / (boardWidthFloat * boardHeightFloat);
        return boardLength;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Generate random integer
        final int randomInt = 1 + (int) (Math.random() * ((6 - 1) + 1));

        // Scanners
        final Scanner input = new Scanner(System.in);
        final Scanner input2 = new Scanner(System.in);

        // Check if input is valid
        try {
            System.out.print("Enter the width(inches): ");
            final float width = Float.parseFloat(input.nextLine());
            System.out.print("Enter the height(inches): ");
            final float height = Float.parseFloat(input2.nextLine());
            if (width > 0 && height > 0) {
                // Amounts are valid if positive
                final float length = checkBoardLength(width, height);
                System.out.println("The "
                                 + "wood should be " + length
                                 + " inch(es) long."
                );
            } else {
                // Input is invalid
                Integer.parseInt(null);
            }
        } catch (NumberFormatException nfe) {
            // Input is invalid
            System.out.println("Invalid input.");
        }

        // Close scanners
        input.close();
        input2.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
