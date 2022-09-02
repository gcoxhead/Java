/*
/* This class contains the logic needed to run the connect 4 game
*/

import java.util.Random; //import the Random class to enable random int generator

public class GameLogic{
    private Board board;
    private Player player1;
    private Player player2;

    public GameLogic(){ //Create objects of the classes to play the game
        board = new Board();
        player1 = new Player("R"); //player 1 is red
        player2 = new Player("Y"); //player 2 (Computer) is yellow
    }

    public void playGame(){
        Random random = new Random(); //create a new random object 

        System.out.println(board.getPrintableBoard()); // print the initial playing board  
        Player player = player1; //start with player 1
        System.out.println("Player 1: Please select a column 1-6 to place your counter");

        while(!board.hasWon()){
            if (player.equals(player1)){ 
            Move m = player.getMove(); //get move from the player
            board.placeToken(m.getCol(), player.getToken()); //place token in the board
            String pb = board.getPrintableBoard();
            System.out.println(pb);}

            //Random integer is generated between and token is placed in the board
            else {  //computer plays as player 2
            board.placeToken(random.nextInt(6)+1, player.getToken());
            String pb = board.getPrintableBoard();
            System.out.println(pb);} // print new board
             
            if (player.equals(player1)){ //switch players
                player = player2;
                System.out.println("Player 2 has placed a counter");
            }
           else{
                player = player1; //switch players
                System.out.println("Player 1: Please select a column 1-6 to place your counter");
            
            }
        }
    }
}