package pieces;

import service.ChessPiece;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessPiece[][] chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            if (line==toLine && column==toColumn) return false;

            check = false;
            return Math.abs(toLine - line) < 2 && Math.abs(toColumn - column) < 2;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessPiece[][] board, int line, int column) {
        boolean flag = false;

        if (board[line][column].getSymbol().equals("K") && board[line][column].getColor().equals("White")) {
            for (int i = 0, j = 0; i < 7 && j < 7; i++, j++) {
                if (board[i][j].getColor().equals("Black") && board[i][j].canMoveToPosition(board,i,j,line,column)) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
