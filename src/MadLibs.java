import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        String color;
        String wordEst;
        String bodyPart;
        String animal;

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a color >>> ");
        color = input.nextLine();

        System.out.println("Please enter a word ending in EST >>> ");
        wordEst = input.nextLine();

        System.out.println("Please enter a body part >>> ");
        bodyPart = input.nextLine();

        System.out.println("Please enter a animal >>> ");
        animal = input.nextLine();

        c = a%b;

        System.out.println("The " + color + " Chicken is the " + wordEst + " chicken of all." +
                " it also likes to eat " + animal + " and their " + bodyPart);
        }

}
