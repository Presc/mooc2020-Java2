
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            int amount = 0;
            String input = scan.nextLine();
            String[] parts = input.split(" ");
                        
            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
                if (amount < 0) {
                    amount = 0;
                }
            }
            
            if (input.equals("quit")) {
                break;
            }                        
            
            if (parts[0].equals("add")) {                
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }           
                        
            if (parts[0].equals("move")) {
                if (first - amount < 0) {
                    second += first;
                    first = 0;                    
                } else if (second + amount > 100) {
                    second = 100;
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                }
            }
            
            if (parts[0].equals("remove")) {
                if (second - amount < 0) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }          
        }
    }
}
