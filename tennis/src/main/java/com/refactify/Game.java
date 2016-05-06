package com.refactify;

public class Game {
    private int[] playerScores = new int[] {0, 0};

    public String score() {
        if(playerScores[0] >= 4 && playerScores[0] >= playerScores[1]+2) {
            return "Set - Player One";
        }
        else if(playerScores[1] >= 4 && playerScores[1] >= playerScores[0]+2) {
            return "Set - Player Two";
        }
        else if(playerScores[0] > 3 && playerScores[0]-1 == playerScores[1]) {
            return "ad in";
        }
        else if(playerScores[1] > 3 && playerScores[1]-1 == playerScores[0]) {
            return "ad out";
        }
        else {
            return String.format("%s - %s", translateScore(playerScores[0]),
              scoreIsEven() ? "all" : translateScore(playerScores[1]));
        }
    }

    public String translateScore(int score) {
        String translatedScore = "";
        switch(score) {
            case 1:
              translatedScore = "15";
              break;
            case 2:
              translatedScore = "30";
              break;
            case 3:
              translatedScore = "40";
              break;
            default:
              translatedScore = "love";
              break;
        }
        return translatedScore;
    }

    public boolean scoreIsEven() {
        return playerScores[0] == playerScores[1] && playerScores[0] > 0;
    }

    public void playerOneWinsPoint() {
        playerScores[0]++;
    }

    public void playerTwoWinsPoint() {
        playerScores[1]++;
    }
}
