package pieces;

import service.ChessPiece;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
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

            boolean isSquareSuitable = (!chessBoard[toLine][toColumn].getColor().equals(color) || chessBoard[toLine][toColumn] == null);

            return (Math.abs(toLine - line) == Math.abs(toColumn - column) && isSquareSuitable);
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
