
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int times = 0;

        System.out.println("How many random numbers should be printed?");
        times = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < times; i++) {
            System.out.println(random.nextInt(11));
        }
    }

}
