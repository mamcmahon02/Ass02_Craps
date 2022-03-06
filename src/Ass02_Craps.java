import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps {

    public static void main(String[] args) {
    int Die1;
    int Die2;
        Random rnd = new Random();
        boolean endGame = false;
        while (!endGame){
            Die1 = rnd.nextInt(6) + 1;
            Die2 = rnd.nextInt(6) + 1;
            int diceTotal = Die1 + Die2;
            System.out.println("You rolled: " + diceTotal);
            if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12){
                System.out.println("You crapped out!");
                System.out.println("Play again? Y/N");
                endGame = true;
                Scanner input1 = new Scanner(System.in);
                String PlayAgain= input1.nextLine();
                if (PlayAgain.equalsIgnoreCase("Y")) {
                    endGame = false;
                } else {
                    endGame = true;
                    System.exit(0);
                }
            }
            else if (diceTotal == 7 || diceTotal == 11){
                System.out.println("You win!");
                System.out.println("Play again? Y/N");
                endGame = true;
                Scanner input2 = new Scanner(System.in);
                String PlayAgain= input2.nextLine();
                if (PlayAgain.equalsIgnoreCase("Y")) {
                    endGame = false;
                } else {
                    endGame = true;
                    System.exit(0);
                }
            }
            else{
                System.out.println("Roll again");
                continue;


            }

        }
    }
}
