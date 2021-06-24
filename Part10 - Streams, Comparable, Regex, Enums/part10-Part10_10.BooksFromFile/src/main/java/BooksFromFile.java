
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(book -> new Book(book[0], Integer.parseInt(book[1]), Integer.parseInt(book[2]), book[3]))
                    .forEach(books::add);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }
}
