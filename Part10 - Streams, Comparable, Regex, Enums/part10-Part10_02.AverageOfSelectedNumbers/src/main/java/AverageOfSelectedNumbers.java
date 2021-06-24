import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        String input = "";
        double average = 0;


        System.out.println("Input numbers, type \"end\" to stop.");

        for(;;) {
            input = scanner.nextLine();

            if(input.equals("end")) {
                break;
            }

            values.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();

        if(input.equalsIgnoreCase("n")){
            average = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
        } else {
            average = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
        }

        System.out.println("Average of the negative numbers: " + average);

    }
}
