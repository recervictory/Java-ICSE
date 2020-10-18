
/**
 * Code : Implemment Rock Paper Scissors Game
 *
 * @author (Victor Banerjee)
 * @version (1.2)
 */

import java.util.Random;
import java.util.*;

public class RockPaperScissors {
    public static String choice(int ch) {
        if (ch == 1)
            return "Rock";
        else if (ch == 2)
            return "Paper";
        else
            return "Scissor";
    }
    // Return Score
    public static String result(String compChoice, String myChoice) {
        String ch = compChoice + " " + myChoice;
        switch (ch) {
            case "Rock Paper":
            case "Paper Scissor":
            case "Scissor Rock":
                return "Lose";
            case "Paper Rock":
            case "Scissor Paper":
            case "Rock Scissor":
                return "Win";
        }
        return "Tie";
    }
    // Update the Old Score
    public static int[] updateScore(int[] oldScore, String result) {
        switch (result) {
            case "Lose": // If Computer Win
                oldScore[0]++;
                break;
            case "Win": // If I Win
                oldScore[1]++;
                break;
        }
        return oldScore;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int comCh;
        int[] ScoreBoard = { 0, 0 }; // Initial Score Board Array
        while (true) {
            comCh = random.nextInt(3) + 1;
            String compChoice = choice(comCh);
            System.out.print("1. Rock\n2. Paper\n3. Scissor\n\nYour choice(1-4): ");
            int ch = in.nextInt();
            if (ch < 1 || ch > 3)
                break;
            String myChoice = choice(ch);
            System.out.println("You Choose :" + myChoice + "\nComputer Choose : " + compChoice);
            String score = result(myChoice, compChoice);
            System.out.println("\n\t**** " + score + " ****");
            ScoreBoard = updateScore(ScoreBoard, score);
            System.out.println("\nComputer: " + ScoreBoard[0] + " | You: " + ScoreBoard[1]+"\n");
        }
    }
}
