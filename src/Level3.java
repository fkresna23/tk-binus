import java.util.ArrayList;
import java.util.Arrays;

public class Level3 {
    static String[] answers = {
            "honker",
            "honer",
            "heron",
            "krone",
            "kern",
            "horn",
            "kore",
            "honk",
            "hone",
            "hoke",
            "hoer",
            "okeh",
            "hero",
            "hern",
            "keno",
            "eon",
            "ore",
            "noh",
            "nor",
            "one",
            "oke",
            "kor",
            "roe",
            "hoe",
            "rho",
            "hon",
            "her",
            "hen",
            "ern",
            "ken"
    };

    public int playLevel3() {
        int score = 0;
        int count = 0;
        ArrayList<String> typedWords = new ArrayList<String>();

        System.out.println("\nLevel 3");
        System.out.println("--------");
        System.out.println("     h     k     r     n     e     o     ");

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