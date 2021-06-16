
import java.util.Scanner;

/**
 *
 * @author Owen
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        for (;;) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("To add:");
                String add = scanner.nextLine();
                this.list.add(add);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(scanner.nextLine());
                this.list.remove(remove);
            }
        }
    }
}