import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(String prompt, int low, int high) {
        Scanner in = new Scanner(System.in);
        int userInput;

        do {
            System.out.print(prompt);
            while (!in.hasNextInt()) {
                System.out.println("invalid, enter an integer.");
                in.next();
                System.out.print(prompt);
            }
            userInput = in.nextInt();
            if (userInput < low || userInput > high) {
                System.out.println("input should be between " + low + " and " + high + ".");
            }
        } while (userInput < low || userInput > high);

        return userInput;

    }
}
