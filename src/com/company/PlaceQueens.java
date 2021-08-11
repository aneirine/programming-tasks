package com.company;

public class PlaceQueens {
    public static void main(String[] args) {
        Board board = new Board(8);
        board.placeFigures(0);
        board.printBoard();
    }
}

class Board {

    private int board[][];

    public Board(int n) {
        board = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }

    public boolean checkIfPlaceIsValid(int a, int b) {
        if (board[a][b] == 1) return false;
        //checking array horizontal
        for (int i = 0; i < board[a].length; i++) {
            if (i != b) {
                if (board[a][i] == 1) return false;
            }
        }

        //checking array vertical
        for (int i = 0; i < board.length; i++) {
            if (i != a) {
                if (board[i][b] == 1) return false;
            }
        }

        //checking diagonal up
        int left = b - 1, right = b + 1;
        for (int i = a - 1; i >= 0; i--) {
            if (checkLeftRightPoints(left, right, i)) return false;
            left--;
            right++;
        }

        left = b + 1;
        right = b - 1;
        for (int i = a + 1; i < board.length; i++) {
            if (checkLeftRightPoints(left, right, i)) return false;
            left++;
            right--;
        }

        return true;
    }

    private boolean checkLeftRightPoints(int left, int right, int i) {
        if (left >= 0 && left < board.length) {
            if (board[i][left] == 1) return true;
        }
        if (right >= 0 && right < board.length) {
            if (board[i][right] == 1) return true;
        }
        return false;
    }

    public boolean placeFigures(int column) {
        if (column >= board.length) return true;
        for (int i = 0; i < board.length; i++) {

            if (checkIfPlaceIsValid(column, i)) {
                board[column][i] = 1;
                if (placeFigures(column + 1)) {
                    return true;
                }
                board[column][i] = 0;
            }

        }
        return false;
    }

    public void printBoard() {
        System.out.println("----------------------------");
        for (int i = 0; i < this.board.length; i++) {
            System.out.print("|  ");
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("----------------------------");
    }

}
