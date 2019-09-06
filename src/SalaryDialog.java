import javax.swing.*;;import java.awt.*;

public class SalaryDialog {

    public static void main(String[] args){

        String wageString;
        String dependentString;
        int dependent;
        double wage;
        double weeklyPay;
        final double HOURS_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "Enter Employees's hourly wage",
                "Salary Wage 1", JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentString = JOptionPane.showInputDialog(null, "How many dependents?",
                "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        dependent = Integer.parseInt(dependentString);

        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
            weeklyPay + "\nDeductions will be made for " + dependent + " dependents.");

        selection = JOptionPane.showConfirmDialog(null, "Is your salary correct?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showConfirmDialog(null, "You responded "+ isYes);

    }

}
