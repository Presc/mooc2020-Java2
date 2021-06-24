
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        for(;;) {
            System.out.println("Input the name of the book, empty stops:");

            String input = scanner.nextLine();
            String name = input;
            int ageRecommendation;

            if(input.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            ageRecommendation = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name, ageRecommendation);
            books.add(book);


        }
        System.out.println(books.size() + " books in total.");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);

        books.sort(comparator);

        System.out.println("Books:");
        books.forEach(System.out::println);

    }

}

class Book {

    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }


}
