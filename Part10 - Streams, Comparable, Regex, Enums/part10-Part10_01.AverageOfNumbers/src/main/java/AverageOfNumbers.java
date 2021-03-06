import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        for(;;) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }

            values.add(input);
        }

        double average = values.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
