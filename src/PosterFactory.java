import javax.swing.*;

public class PosterFactory {

    public static void main(String[] args){

        String postersBoughtString;
        int postersBought;
        int boxesFilled;
        int postersLeftOver;
        final int BOX_LIMIT = 11;

        postersBoughtString = JOptionPane.showInputDialog(null, "How many quarts to do you have? ",
                JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought / BOX_LIMIT;
        postersLeftOver = postersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were "
            + boxesFilled + " with " + postersLeftOver + " posters left over.");
    }

}
