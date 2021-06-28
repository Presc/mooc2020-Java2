
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare square = msFactory.createMagicSquare(15);
        System.out.println(square);
        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfDiagonals());

    }
}
