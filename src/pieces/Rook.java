package pieces;

import service.ChessPiece;

public class Rook extends ChessPiece {
    public Rook(String color) {
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
            return toLine != line && column == toColumn || line == toLine;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
