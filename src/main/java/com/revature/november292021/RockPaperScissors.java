package com.revature.november292021;

import java.util.Scanner;

public class RockPaperScissors {
    public static String playerVsPlayer(int player1, int player2) {
        // rock - 1, paper - 2, scissors - 3

        String results = null;

        if(player1 == player2)
            results = "Tie!";
        else {
            switch (player1) {
                case 1: // rock
                    switch (player2) {
                        case 2:
                            results = "Player 2 wins!";
                            break;
                        case 3:
                            results = "Player 1 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                case 2: // paper
                    switch (player2) {
                        case 1:
                            results = "Player 1 wins!";
                            break;
                        case 3:
                            results = "Player 2 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                case 3: // scissors
                    switch (player2) {
                        case 1:
                            results = "Player 2 wins!";
                            break;
                        case 2:
                            results = "Player 1 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                default:
                    results = "Invalid input(s). Please try again.";
                    break;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();
        boolean isRunning = true;
        String response;

        System.out.println("Let's play rock, paper, scissors!");
        while(isRunning) {
            System.out.println();
            System.out.println("Player 1, please choose your hand:");
            options();
            int player1 = scanner.nextInt();
            System.out.println();

            System.out.println("Player 2, please choose your hand:");
            options();
            int player2 = scanner.nextInt();
            System.out.println();

            System.out.println("Rock, paper, scissors shoot!");
            System.out.println(rps.playerVsPlayer(player1, player2));
            System.out.println();

            System.out.println("Play again? (y/n)");
            response = scanner.next();

            if(response.equals("n") || response.equals("N"))
                isRunning = false;
        }
    }

    public static void options() {
        System.out.println("[1] rock");
        System.out.println("[2] paper");
        System.out.println("[3] scissors");
    }
}
