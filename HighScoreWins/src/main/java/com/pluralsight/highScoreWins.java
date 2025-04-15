package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class highScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a game score (Example format Home:Visitor|21:9): ");
        String gameInfo = input.nextLine().trim();

        String[] parts = gameInfo.split("\\|");

        // parts[0] = "Home:Visitor"
        String[] teams = parts[0].split(":");
        String team1 = teams[0].trim();
        String team2 = teams[1].trim();

        // parts[1] = "21:9
        String[] scores = parts[1].split(":");
        int score1 = Integer.parseInt(scores[0].trim());
        int score2 = Integer.parseInt(scores[1].trim());

        String winner;

        if (score1 > score2) {
            winner = teams[0];
        } else if (score2 > score1) {
            winner = teams[1];
        } else {
            winner = "It's a tie!";
        }


        System.out.println("Winner: " + winner);
    }
}
