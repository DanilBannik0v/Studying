package pieces;

import service.ChessPiece;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessPiece[][] chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)){
            if (line==toLine && column==toColumn) return false;

            return (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2) ||
                   (Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1);
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
