import javax.swing.*;
import java.util.Scanner;

public class NauticalMile {

    public static void main(String[] args){

        final double NM_TO_MILE = 1.150779;
        final double NM_TO_KILO = 1.852;
        double userEnteredNauticalMile = 0;
        double nauticalToMiles;
        double nauticalToKilo;

        nauticalToMiles = NM_TO_MILE * userEnteredNauticalMile;
        System.out.println("There are " + nauticalToMiles + " miles in "
                + userEnteredNauticalMile + " nautical miles.");

        nauticalToKilo = NM_TO_KILO * userEnteredNauticalMile;
        System.out.println("There are " + nauticalToKilo + " Kilos in "
                + userEnteredNauticalMile + " nautical miles.");
    }
}
