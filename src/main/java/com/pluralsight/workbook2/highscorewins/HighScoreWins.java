package com.pluralsight.workbook2.highscorewins;

public class HighScoreWins {

    public static void gameWinner(String gameScore) {
        String playerOne;
        String playerTwo;
        int scoreOne;
        int scoreTwo;
        var split = gameScore.split("\\|");
        var splitTeams = split[0].split(":");
        var splitScore = split[1].split(":");
        playerOne = splitTeams[0];
        playerTwo = splitTeams[1];
        scoreOne = Integer.parseInt(splitScore[0]);
        scoreTwo = Integer.parseInt(splitScore[1]);

        if (scoreOne > scoreTwo) System.out.println("Winner: " + playerOne + " Score: " + scoreOne);
        else System.out.println("Winner: " + playerTwo +" Score: " + scoreTwo);
    }

    public static void main(String[] args) {
        gameWinner("Home:Visitor|21:9");
    }
}