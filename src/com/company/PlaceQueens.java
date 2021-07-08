package com.company;

import java.util.Random;


public class PlaceQueens {
    public static void main(String[] args) {
        Board board = new Board();
        board.placeFigures();
        board.printBoard();
    }
}

class Board {

    private int board[][];
    private int a = 0;
    private int b = 0;

    public Board() {
        board = new int[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.board.length; i++) {
            System.out.print("{");
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j] + ", ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    public boolean checkIfPlaceIsValid(int a, int b) {
        if (board[a][b] == 1) return false;
        //checking array horizontal
        for (int i = 0; i < board[a].length; i++) {
            System.out.print("EH " + board[a][i] + " ");
            if (i != b) {
                if (board[a][i] == 1) return false;
            }
        }

        //checking array vertical
        for (int i = 0; i < board.length; i++) {
            System.out.print("EV " + board[i][b] + " ");
            if (i != a) {
                if (board[i][b] == 1) return false;
            }
        }

        //checking diagonal up
        int left = b - 1, right = b + 1;
        for (int i = a - 1; i >= 0; i--) {
            if (left > 0 && left < 8) {
                if (board[i][left] == 1) return false;
            }
            if (right > 0 && right < 8) {
                if (board[i][right] == 1) return false;
            }
            left--;
            right++;
        }

        left = b + 1;
        right = b - 1;
        for (int i = a + 1; i < board.length; i++) {
            if (left > 0 && left < 8) {
                if (board[i][left] == 1) return false;
            }
            if (right > 0 && right < 8) {
                if (board[i][right] == 1) return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private int generateRandomPosition() {
        return new Random().nextInt(board.length - 1);
    }

    public void placeFigures() {
        int position1 = generateRandomPosition(), position2 = generateRandomPosition();
        if (checkIfPlaceIsValid(a, b)) {
            board[position1][position2] = 1;
            findFreePlace();
        }
        while (a > -1 && b > -1) {
            board[a][b] = 1;
            findFreePlace();
        }

    }

    public void findFreePlace() {
        a = -1;
        b = -1;
        outerLoop:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (checkIfPlaceIsValid(i, j)) {
                    a = i;
                    b = j;
                    break outerLoop;
                }
            }
        }
    }

}
