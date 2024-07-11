package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        String userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case "1" -> Cli.greet();
            case "2" -> Even.isEven();
            case "3" -> Calc.calculateExpression();
            default -> System.exit(0);
        }

        scanner.close();
    }
}

