/*
* Copyright (C) 2021 Codey Program
*/

import java.io.*;

/**
* Main Method used to run the SRPN calculator
* Reads user input from the command line interface
* Passes the input command to the processCommand
* method in SRPN.java
*
* @author Codey Program
* @version 1.1.1
*/
class Main {

     public static void main(String[] args) {
         // Instantiate an object of the SRPN class
         SRPN sprn = new SRPN();

         // Instantiate a reader object to accept user input
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
         // Handle input exceptions with a try/catch statement 
         try {

             // Keep on accepting input from the command-line
             while(true) {
             String command = reader.readLine();

             // Close on an End-of-file (EOF) (Ctrl-D on the terminal)
             if(command == null){

             // Exit code 0 for a graceful exit
             System.exit(0);
             }        

             // Otherwise, (attempt to) process the character
             sprn.processCommand(command);          
             } 
             }
         
         // Catch input exceptions and print error message
         catch(IOException e){
             System.err.println(e.getMessage());
             System.exit(1);
             }
     } 
}
