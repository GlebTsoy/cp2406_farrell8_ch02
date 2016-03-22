import javax.swing.*;

public class Eggs {
    public static void main(String[] args){
        final double PRIZE_FOR_DOZEN = 3.25;
        final double PRIZE_FOR_SINGLE = 0.45;
        double priceForDozens, priceForLoose, totalPrice;
        int numberOfEggs;
        int dozens;
        int looseEggs;
        String numberOfEggsString;
        numberOfEggsString = JOptionPane.showInputDialog("How many eggs?");
        numberOfEggs = Integer.parseInt(numberOfEggsString);
        dozens = numberOfEggs/12;
        looseEggs = numberOfEggs - 12*dozens;
        priceForDozens = dozens * PRIZE_FOR_DOZEN;
        priceForLoose = looseEggs * PRIZE_FOR_SINGLE;
        totalPrice = priceForDozens + priceForLoose;
        System.out.println("You ordered "+ numberOfEggs+ " eggs. " + "That's "+ dozens + " at " + PRIZE_FOR_DOZEN + " and " + looseEggs + " loose eggs" + " at " + PRIZE_FOR_SINGLE + " $ each for a total of " + totalPrice+ "$");
    }
}
