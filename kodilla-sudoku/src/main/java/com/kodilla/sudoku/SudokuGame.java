package com.kodilla.sudoku;

public class SudokuGame {

    private int[][] board = new int[9][9];

    private static void resolveSudoku() {

        //rozwal sudoku do konca jakims algorytmem. Stan tabeli w board/
    }

    private static void printBoard() {
        //wyswietl aktualna plansze sudoku na podstawie tabelki board.
    }

    public static void main(String[] args) {

        printBoard();
        boolean gameFinished = false;
        while (!gameFinished) {
            //wyswietl instrukcje uzytkownikowi
            //skaner

            printBoard();

            //if wybral sudoku
            resolveSudoku();
            gameFinished = true;
        }
    }


}
