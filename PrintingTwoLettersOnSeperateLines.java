package ProblemSolvingTask;

public class PrintingTwoLettersOnSeperateLines {
        public static void main(String[] args) {
            String word = "VENTURES";
            for (int i = 0; i < word.length(); i += 2) {
                char letter1 = word.charAt(i);
                char letter2 = word.charAt(i + 1);
                System.out.println(letter1 + "" + letter2);
            }
        }
    }


