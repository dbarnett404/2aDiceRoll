import java.util.Scanner;

public class Game {

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        int numDice = scanner.nextInt();
        System.out.println("How many times do you want to roll the dice?");
        int numRolls = scanner.nextInt();
        int matchCount = 0;
        Dice dice = new Dice(numDice);
        for (int i = 0; i < numRolls; i++) {
            System.out.print("Roll " + i + " of " + numRolls + " ");
            if (dice.rollDice()) {
                matchCount++;
            }
        }
        System.out.println("Num matching " + matchCount
                + ". Probability is "
                + dice.probability(numRolls) );
    }
}
