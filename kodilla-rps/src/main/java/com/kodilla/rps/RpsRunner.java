package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;
        boolean infoDisplayed = false;
        int rounds = 0;
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            if (!infoDisplayed) {
                getUserName(scanner);
                rounds = getUserRounds(scanner);
                infoDisplayed = true;
            }
            playRockPaperScissors(scanner);
            rounds--;
            if (rounds == 0) {
                System.out.println("x = end the game, n = play again");
                String inputString = scanner.next();
                if (inputString.equals("n")) {
                    System.out.println("Started again");
                    end = false;
                    infoDisplayed = false;
                }
                if (inputString.equals("x")) {
                    System.out.println("Game finished");
                    end = true;
                }
            };
        }
    }

    private static int getUserRounds(Scanner scanner) {
        int rounds;
        System.out.println("How many rounds would you like to play?");
        rounds = scanner.nextInt();
        return rounds;
    }

    private static void getUserName(Scanner scanner) {
        System.out.println("Game rules: " + "\n" + "1 = rock" + "\n" + "2 = paper" + "\n" + "3 = scissors" + "\n" + "x = End the game" + "\n" + "n = Restart the game" + "\n");
        System.out.println("Enter your name: ");
        String userName = scanner.next();
        System.out.println("Let's go " + userName + "!");
    }

    private static void playRockPaperScissors(Scanner scanner) {
        System.out.println("Make a move! Click 1 = rock, 2 = paper, 3 = scissors");

        int playerMove = scanner.nextInt(); // 1
        int computerMove = getComputerMove(); // 2

        compareMoves(playerMove, computerMove);
    }

    private static void compareMoves(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            System.out.println("It's a draw");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins");
        } else {
            System.out.println("Computer wins");
        }
    }

    private static int getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 1;

        System.out.println("Computer chose: " + randomNumber);
        return randomNumber;
    }

    static boolean playerWins(int playerMove, int computerMove) {
        if (playerMove == 1) {
            return computerMove == 3;
        } else if (playerMove == 2) {
            return computerMove == 1;
        } else {
            return computerMove == 2;
        }
    }
}
