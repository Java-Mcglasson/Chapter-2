import javax.swing.*;
import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main(String[] args){

        String numQuartsString;
        int numQuarts;
        int numGallons;
        int quartsRemaining;
        final int NUM_QUARTS_IN_GALLON = 4;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of quarts you have >>> ");
        numQuarts = keyboard.nextInt();

        numQuartsString = JOptionPane.showInputDialog(null, "How many posters ordered today? ",
                JOptionPane.INFORMATION_MESSAGE);
        numQuarts = Integer.parseInt(numQuartsString);

        numGallons = numQuarts / NUM_QUARTS_IN_GALLON;

        quartsRemaining = numQuarts % NUM_QUARTS_IN_GALLON;

        System.out.println("The number of gallons is " + numGallons + " with " +
                quartsRemaining + " quarts remaining.");
    }

}
