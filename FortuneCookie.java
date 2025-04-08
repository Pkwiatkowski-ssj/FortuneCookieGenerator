import java.util.Scanner;
import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fortunes = {
            "Your kindness will lead you to unexpected places.",
            "Today is a good day to try something new."
        };

        System.out.println("🥠 Welcome to the Fortune Cookie Generator!");
        System.out.println("Press ENTER to crack open your cookie (or type 'exit' to quit).");
    }
}