/*
/*This class contains methods for taking a move input from the player as well 
/*as well returning a counter token
*/

import java.io.*; // import java io class to enable in/out functionality

public class Player {

    private String token; 
    private BufferedReader in;
    
    public Player (String token){
        this.token = token; // create counter token object
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public Move getMove(){ // method to get a move from the human player
        try{
            String col = in.readLine();
            int c = Integer.parseInt(col);
            return new Move(c);}
        // catch exceptions and print error message
        catch(IOException e){
            System.out.println("Error while making board move");
        }
        catch(NumberFormatException e){
            System.out.println("Error while making board move");}
        return null;
    }
    public String getToken(){
        return token;
    }

} 