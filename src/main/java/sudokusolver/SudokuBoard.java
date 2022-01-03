package sudokusolver;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private static final int BOARD_SIZE = 9;
    private List<SudokuRow> board;
    private SudokuRow row;

    public SudokuBoard() {
        createEmptyBoard();
    }

    private void createEmptyBoard() {
        board = new ArrayList<SudokuRow>(BOARD_SIZE);
        for (int i = 0; i < BOARD_SIZE; i++) {
            board.add(new SudokuRow());
        }
    }

    public SudokuRow getRow(int i) {
        return board.get(i);
    }

    public int getBoardSize() {
        return BOARD_SIZE;
    }

    public String toString() {
        String printBoard = "+-------+-------+-------+\n";
        for (int i = 0; i <3; i++) {
            printBoard += board.get(i) + "\n";
        }
        printBoard += "+-------+-------+-------+\n";
        for (int i = 3; i <6; i++) {
            printBoard += board.get(i) + "\n";
        }
        printBoard += "+-------+-------+-------+\n";
        for (int i = 6; i <9; i++) {
            printBoard += board.get(i) + "\n";
        }
        printBoard += "+-------+-------+-------+\n";

        return printBoard;
    }

}
