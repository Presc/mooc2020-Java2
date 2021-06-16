
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        for (;;) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            int amount = 0;
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if(input.equals("quit")) {
                break;
            }
            
            if(parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }
            
            if(parts[0].equals("add")) {
                first.add(amount);
            }
            
            if(parts[0].equals("move")) {
                if (first.contains() - amount < 0) {
                    second.add(first.contains());
                    first.remove(100);
                } else if (second.contains() + amount > 100) {
                    second.add(100);
                    first.remove(100);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
            
            if(parts[0].equals("remove")) {
                second.remove(amount);
            }
            
        }
        
    }

}