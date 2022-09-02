 public class Main {
    
    public static void main(String[] args) {
     GameMessage message = new GameMessage(); //create objects of classes
     GameRules rules = new GameRules();
     GameLogic logic = new GameLogic(); 
     
     message.welcome(); //call the welcome method
     rules.gameRules(); // call the gameRules method
     message.letsPlay(); // call the letsPlay method
     logic.playGame(); //call the playGame method to start the game
    }
}