package classes;

public class TicTacToe {
    private int x;
    private int y;
    private String[][] twoDimArray = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

    public TicTacToe() {
    }

    public void getField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + this.twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String[][] newGame() {
        this.twoDimArray = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        return this.twoDimArray;
    }

    public String checkGame() {
        String result = "";
        if (this.twoDimArray[0][0].equals("X") && this.twoDimArray[0][1].equals("X") && this.twoDimArray[0][2].equals("X")) {
            result = "X";
        } else if (this.twoDimArray[1][0].equals("X") && this.twoDimArray[1][1].equals("X") && this.twoDimArray[1][2].equals("X")) {
            result = "X";
        } else if (this.twoDimArray[2][0].equals("X") && this.twoDimArray[2][1].equals("X") && this.twoDimArray[2][2].equals("X")) {
            result = "X";
        }
        // horizont X
        else if (this.twoDimArray[0][0].equals("X") && this.twoDimArray[1][0].equals("X") && this.twoDimArray[2][0].equals("X")) {
            result = "X";
        } else if (this.twoDimArray[0][1].equals("X") && this.twoDimArray[1][1].equals("X") && this.twoDimArray[2][1].equals("X")) {
            result = "X";
        } else if (this.twoDimArray[0][2].equals("X") && this.twoDimArray[1][2].equals("X") && this.twoDimArray[2][2].equals("X")) {
            result = "X";
        }
        // vertical X
        else if (this.twoDimArray[0][0].equals("X") && this.twoDimArray[1][1].equals("X") && this.twoDimArray[2][2].equals("X")) {
            result = "X";
        } else if (this.twoDimArray[1][2].equals("X") && this.twoDimArray[1][1].equals("X") && this.twoDimArray[2][0].equals("X")) {
            result = "X";
        }
        // diagonal X

        else if (this.twoDimArray[0][0].equals("O") && this.twoDimArray[0][1].equals("O") && this.twoDimArray[0][2].equals("O")) {
            result = "O";
        } else if (this.twoDimArray[1][0].equals("O") && this.twoDimArray[1][1].equals("O") && this.twoDimArray[1][2].equals("O")) {
            result = "O";
        } else if (this.twoDimArray[2][0].equals("O") && this.twoDimArray[2][1].equals("O") && this.twoDimArray[2][2].equals("O")) {
            result = "O";
        }
        // horizont O
        else if (this.twoDimArray[0][0].equals("O") && this.twoDimArray[1][0].equals("O") && this.twoDimArray[2][0].equals("O")) {
            result = "O";
        } else if (this.twoDimArray[0][1].equals("O") && this.twoDimArray[1][1].equals("O") && this.twoDimArray[2][1].equals("O")) {
            result = "O";
        } else if (this.twoDimArray[0][2].equals("O") && this.twoDimArray[1][2].equals("O") && this.twoDimArray[2][2].equals("O")) {
            result = "O";
        }
        // vertical O
        else if (this.twoDimArray[0][0].equals("O") && this.twoDimArray[1][1].equals("O") && this.twoDimArray[2][2].equals("O")) {
            result = "O";
        } else if (this.twoDimArray[1][2].equals("O") && this.twoDimArray[1][1].equals("O") && this.twoDimArray[2][0].equals("O")) {
            result = "O";
        }
        // diagonal O
        else {
            if (isFilled()) {
                result = "Draw";
            }
        }
        return result;
    }

    public void makeMove(int x, int y, String symbol) {
        if (this.twoDimArray[y][x].equals("X") || this.twoDimArray[y][x].equals("O")) {
            System.out.println("Cell x, y is already occupied");
        } else {
            this.twoDimArray[y][x] = symbol;
            System.out.println("Move completed");
            System.out.println(checkGame());
        }
    }

    public boolean isFilled() {
        boolean flag = false;
        int simbolCounter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.twoDimArray[i][j].equals("X") || this.twoDimArray[i][j].equals("O")) {
                    simbolCounter += 1;
                }
            }
        }
        if (simbolCounter==9) {
            flag = true;
        }
        return flag;
    }
}

