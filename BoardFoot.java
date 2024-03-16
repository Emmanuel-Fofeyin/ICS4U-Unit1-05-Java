/*
 * will then calculate the length, so that the result
 * is exactly 1 board foot and returns that value.
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
    public static float calculateBoardFoot(
        float boardWidthFloat, float boardHeightFloat) {
        final int boardFoot = 144;
        final float boardLength = boardFoot / (boardWidthFloat * boardHeightFloat);

        return boardLength;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // variables
        final Scanner scanner = new Scanner(System.in);
        final String invalidInput = "Invalid input.";

        // input
        System.out.print("Enter the width(inches): ");
        final String boardWidthString = scanner.nextLine().trim();
        System.out.print("Enter the height(inches): ");
        final String boardHeightString = scanner.nextLine().trim();

        // error check
        try {
            if (boardWidthString.isEmpty() || boardHeightString.isEmpty()) {
                System.out.println(invalidInput);
            } else {
                final float boardWidthFloat =
                    Float.parseFloat(boardWidthString);
                final float boardHeightFloat =
                    Float.parseFloat(boardHeightString);
                if (boardWidthFloat < 0 || boardHeightFloat < 0) {
                    System.out.println(invalidInput);
                } else {
                    // process
                    final float boardLength = calculateBoardFoot(
                        float boardWidthFloat, float boardHeightFloat
                    );
                    // output
                    System.out.println(
                        "The wood should be " + boardLength
                        + " inch(es) long."
                    );
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(invalidInput);
        }
        System.out.println("\nDone.");
    }
}

