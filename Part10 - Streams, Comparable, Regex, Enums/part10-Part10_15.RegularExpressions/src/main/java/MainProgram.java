

public class MainProgram {

    public static void main(String[] args) {
        Checker test = new Checker();

        System.out.println(test.isDayOfWeek("mon"));
        System.out.println(test.isDayOfWeek("abc"));

        System.out.println(test.allVowels("oi"));
        System.out.println(test.allVowels("queue"));
    }
}
