import classes.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.getField();
        board.makeMove(0,0,"X");
        board.makeMove(1,0,"O");
        board.makeMove(0,1,"X");
        board.makeMove(1,1,"O");
        board.makeMove(1,1,"X"); //filled
        board.makeMove(0,2,"X");

        board.getField();
    }
}