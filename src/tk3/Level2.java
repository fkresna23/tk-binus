package tk3;

import java.util.ArrayList;
import java.util.Arrays;

public class Level2 {
    static String[] answers = {
            "seance",
            "seneca",
            "encase",
            "canes",
            "cense",
            "cease",
            "scene",
            "scena",
            "acnes",
            "ease",
            "cees",
            "sane",
            "cane",
            "case",
            "cans",
            "acne",
            "scan",
            "sene",
            "anes",
            "seen",
            "ace",
            "sea",
            "sen",
            "sec",
            "see",
            "sae",
            "sac",
            "nee",
            "ane",
            "can",
            "cee",
            "ens",
            "nae"
    };

    public int playLevel2() {
        int score = 0;
        int count = 0;
        ArrayList<String> typedWords = new ArrayList<String>();

        System.out.println("\nLevel 2");
        System.out.println("--------");
        System.out.println("     s     e     c     a     e     n     ");

        for (int i = 1; i <= 10;) {
            System.out.print(i +  "> Your Answer : ");
            String answer = CoepoePuzzle.input.next();

            // check if the answer length is less than 3 or greater than 6
            if (answer.length() < 3 || answer.length() > 6) {
                System.out.println("Your answer must be 3-6 characters long.");
                continue;
            }

            // check if the answer is inside the answers array
            if (Arrays.stream(answers).anyMatch(answer::contains)) {

                // check if the answer is already typed
                if (typedWords.contains(answer)) {
                    System.out.println("You had already type this word before!");
                    continue;
                }

                score += 10;
                typedWords.add(answer);
                System.out.println("#Right. Score : " + score);
                count += 1;
                i++;
            } else {
                System.out.println("#Wrong. Score : " + score);
                i++;
            }
        }

        showSummary(count);
        return score;
    }

    private void showSummary(int count) {
        System.out.println("You had answerd 10 times with " + count + " right answers..");
        System.out.println("Correct Answers : ");
        for (String answer : answers) {
            System.out.print(answer + " ");
        }
    }
}