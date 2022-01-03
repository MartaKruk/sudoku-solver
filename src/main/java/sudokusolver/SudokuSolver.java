package sudokusolver;

public class SudokuSolver {

    private final SudokuBoard board;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
    }

    //TODO: create solving algorithm
//    public boolean resolveSudoku() {
//        for (int i = 0; i < board.getBoardSize(); i++) {
//            SudokuRow row = board.getRow(i);
//            for (SudokuElement element: row.getRow()) {
//                if (element.getValue() != -1 && element.getPossibleValues().size() == 1) {
//                }
//            }
//        }
//        return false;
//    }
}
