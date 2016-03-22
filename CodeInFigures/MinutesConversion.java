import javax.swing.*;

public class MinutesConversion {
    public static void main(String[] args){
        String minutesString;
        int minutes, hours;
        double days;
        minutesString = JOptionPane.showInputDialog("Input minutes");
        minutes = Integer.parseInt(minutesString);
        hours = minutes / 60;
        days  = (double)hours/24;
        System.out.print(minutes + " Minutes is " + hours + " Hours and " + days + "days");
    }
}
