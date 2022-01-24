import java.math.BigDecimal;
import java.util.ArrayList;

public class Dice {
    private int[] allDice;
    private int numDice;
    public Dice (int numDice) {
        this.numDice = numDice;
        allDice = new int [numDice];
    }

    public boolean rollDice() {
        System.out.print("Rolling ");
        for (int i = 0; i < allDice.length; i++) {
            allDice[i] = (int)(Math.random() * 6 + 1);
            System.out.print(allDice[i] + " ");
        }
        boolean diceMatch = true;
        for (int i = 0; i < allDice.length - 1; i++) {
            if (allDice[i] != allDice[i+1]) {
                diceMatch = false;
            }
        }
        if (diceMatch) {
            System.out.println(" all dice match");
        } else {
            System.out.println();
        }
        return diceMatch;
    }

    public double probability(int numRolls) {
        //System.out.println(Math.pow(1/6, numDice - 1));
        //System.out.println(Math.pow(1/Double.valueOf(6), numDice - 1));
        return Math.pow(1/Double.valueOf(6), numDice - 1) * numRolls;
    }
}
