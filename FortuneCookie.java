import java.util.Scanner;
import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // Array of fortunes
        String[] fortunes = {
            "Your kindness will lead you to unexpected places.",
            "Today is a good day to try something new."
        };
        // Welcome message
        System.out.println("🥠 Welcome to the Fortune Cookie Generator!");
        System.out.println("Press ENTER to crack open your cookie (or type 'exit' to quit).");
        // Main Loop
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Generate and display a random fortune
            int index = rand.nextInt(fortunes.length);
            System.out.println("Your fortune: " + fortunes[index]);
            System.out.println();
        }

        // Farewell message
        System.out.println("Goodbye, wise soul.");
        scanner.close();
    }
}
    

