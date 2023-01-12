package service;

public abstract class ChessPiece {
    protected String color;
    protected boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessPiece[][] chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
