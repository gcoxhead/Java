/*
/*This class contains messages that can be called whilst 
/*the connect 4 game is being played
*/

public class GameMessage extends GameLogic{

    public void welcome(){
     System.out.println("\n\t\t\tWELCOME TO CONNECT FOUR!");
     }

    public void letsPlay(){
     System.out.println("\n\t\t\tLETS PLAY!!!\n");
     }

    public void gameOver(){
     System.out.println("\n\t\t\t...GAME OVER...");
    }
}