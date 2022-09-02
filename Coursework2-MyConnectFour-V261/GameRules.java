/*
This class contains the game rules for connect 4
*/

public class GameRules{ //prints out the rules of the connect 4 game

    public void gameRules(){
        System.out.println("\nOBJECTIVE:");

        System.out.println("");

        System.out.println("\n\tThe first player to connect 4 of their counters");

        System.out.println("\tin a row is declared the winner!");

        System.out.println("");

        System.out.println("\nGAME RULES:");

        System.out.println("\n\t- There are 2 players in this game.");

		System.out.println("\n\t- Player 1 (Human) has Red counters, \n\t- Player 2 (Computer) has Yellow counters.");

		System.out.println("\n\t- Players take alternate turns to place 1 counter in a column.");

		System.out.println("\n\t- The game ends when a player has connected 4 counters in");

        System.out.println("\t  a row - vertically, horizontally or diagonally.");
        
        System.out.println("");
        
        System.out.println("A draw is declared if all counters have been placed in the columns");

		System.out.println("");

        
    }
}