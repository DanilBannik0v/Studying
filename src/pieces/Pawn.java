package pieces;

import service.ChessPiece;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
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

            boolean isSquareSuitable = (!chessBoard[toLine][toColumn].getColor().equals(color) || chessBoard[toLine][toColumn] == null);

            if ((color.equals("White")) && (line == 1)) {
                return (toLine - line == 1 || toLine - line == 2) && isSquareSuitable;
            } else if (color.equals("White") && toLine-line==1 && isSquareSuitable) {
                return true;

            } else if ((color.equals("Black")) && (line == 6)) {
                return line - toLine == 1 || line - toLine == 2 && isSquareSuitable;
            } else return (color.equals("Black")) && line - toLine == 1 && isSquareSuitable;

        } else return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
