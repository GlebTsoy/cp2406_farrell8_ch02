import javax.swing.JOptionPane;
public class InchesToFeet {
    public static void main(String[] args){
        final int INCHES_IN_FOOT = 12;
        int inches;
        int feet;
        int leftInches;
        String inchesString;
        inchesString = JOptionPane.showInputDialog("Enter inches");
        inches = Integer.parseInt(inchesString);
        feet = inches / INCHES_IN_FOOT;
        leftInches = inches%INCHES_IN_FOOT;
        System.out.println(inches + " Inches in foo" + " will be " + feet + " foot and " +leftInches + " inches");
    }
}
