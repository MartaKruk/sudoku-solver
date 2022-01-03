package sudokusolver;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private static final int ROW_SIZE = 9;
    private List<SudokuElement> row;

    public SudokuRow() {
        createEmptyRow();
    }

    private void createEmptyRow() {
        row = new ArrayList<SudokuElement>(ROW_SIZE);
        for (int i = 0; i < ROW_SIZE; i++) {
            row.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getRow() {
        return row;
    }

    public int getRowSize() {
        return ROW_SIZE;
    }

    public SudokuElement getElement(int i) {
        return row.get(i);
    }

    @Override
    public String toString() {
        String printRow = "| ";
        for (int i = 0; i <3; i++) {
            printRow += row.get(i);
        }
        printRow += "| ";
        for (int i = 3; i <6; i++) {
            printRow += row.get(i);
        }
        printRow += "| ";
        for (int i = 6; i <9; i++) {
            printRow += row.get(i);
        }
        printRow += "|";
        return printRow;
    }
}
