/*
/* This public class contains methods that are public and can be used to contruct, update, and print the connect 4 board.
*/

import java.io.*;

public class Board{ //create a public Board class

    private String[][] board;
    private boolean win;  

    public Board (){ //construct the initial board
        board = new String[][] 
                {{"|",".", ".", ".",".",".",".","."},
                {"|",".", ".", ".",".",".",".","."},
                {"|",".", ".", ".",".",".",".","."},
                {"|",".", ".", ".",".",".",".","."},
                {"|",".", ".", ".",".",".",".","."},
                {"|",".", ".", ".", ".",".", ".","."},
                {"|","1", "2", "3", "4","5", "6","7"}};
        win = false ; //set win to false
    }
    
    //method to place a token on the board
    public void placeToken(int col, String token){ 
        
        for (int i = 5; i>=0; i--){
            if (board[i][col] == "."){
                board[i][col] = token;
                break;
            }
        }
    }

    // method to check for a win
    public boolean hasWon(){
        return win;
    }

    // method to update and prepare the board for printing
    public String getPrintableBoard(){
        String s = "";
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                s += (board[i][j] + " ");
            }
            s += "|\n";
        }
        return s;
    }
}