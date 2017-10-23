package com.CareerDevs;

public class Main {

    public static void main(String[] args) {

        int highScore=calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was "+highScore);

        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Nafissa", highScorePosition);
        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Louis", highScorePosition);
        highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("Ryan", highScorePosition);
        highScorePosition=calculateHighScorePosition(50);
        displayHighScorePosition("Jeff", highScorePosition);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver==true){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName+" managed to get into position "
                +position+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if(score>=500){
            return 2;
        }else if(score>=100){
            return 3;
        }else{
            return 4;
        }
    }

}
