package pieces;

import service.ChessPiece;

public class Queen extends ChessPiece {
    public Queen(String color) {
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

            return ((toLine != line && column == toColumn) ||
                   (Math.abs(toLine - line) == Math.abs(toColumn - column)) ||
                   (line == toLine)) &&
                    isSquareSuitable;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}