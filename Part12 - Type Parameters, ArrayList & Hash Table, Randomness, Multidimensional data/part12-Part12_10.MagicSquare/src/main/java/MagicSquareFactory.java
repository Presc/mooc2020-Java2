
public class MagicSquareFactory {

    private int row;
    private int col;
    private int numberToAdd;
    private int squaresPopulated;
    private int oldRow;
    private int oldCol;

    public MagicSquareFactory() {
        row = 0;
        col = 0;
        numberToAdd = 1;
        squaresPopulated = 0;
        oldRow = 0;
        oldCol = 0;
    }


    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        this.col = size/2;

        if (size > 2) {
            square.placeValue(col, row, numberToAdd++);
            squaresPopulated++;

            while (squaresPopulated < (square.getWidth() * square.getHeight())) {
                up(square);
            }
            return square;
        }
        return null;
    }

    private void up(MagicSquare square) {
        oldRow = row;

        if (row - 1 < 0 ) {
            row = square.getWidth() - 1;
        } else {
            row--;
        }

        right(square);
    }

    private void right(MagicSquare square) {
        oldCol = col;

        if (col + 1 >= square.getHeight()) {
            col = 0;
        } else {
            col++;
        }
        if (square.readValue(col, row) == 0) {
            square.placeValue(col, row, numberToAdd++);
            squaresPopulated++;
        } else {
            down(square);
        }
    }

    private void down(MagicSquare square) {
        square.placeValue(oldCol, oldRow + 1, numberToAdd++);
        squaresPopulated++;
        row = oldRow + 1;
        col = oldCol;
    }
}
