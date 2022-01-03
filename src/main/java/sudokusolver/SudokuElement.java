package sudokusolver;

import java.util.List;

public class SudokuElement {

    private static final int EMPTY = -1;
    private int value;
    private List<Integer> possibleValues;

    public SudokuElement() {
        value = EMPTY;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    @Override
    public String toString() {
        switch (value) {
            case -1:
                return ". ";
            default:
                return value + " ";
        }
    }
}
