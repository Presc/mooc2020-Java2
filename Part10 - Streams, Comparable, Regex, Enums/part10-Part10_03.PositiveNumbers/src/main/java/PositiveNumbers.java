
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1, -1, 2, -2));
        System.out.println(positive(test));

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
