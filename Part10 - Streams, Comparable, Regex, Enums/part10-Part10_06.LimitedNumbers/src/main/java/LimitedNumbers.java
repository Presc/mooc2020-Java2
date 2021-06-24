
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();
        for(;;) {
            String input = scanner.nextLine();

            if(Integer.valueOf(input) < 0)
                break;

            userInput.add(input);
        }

        userInput.stream()
                .mapToInt(Integer::valueOf)
                .filter(value -> value >= 1 && value <= 5)
                .forEach(System.out::println);

    }
}
