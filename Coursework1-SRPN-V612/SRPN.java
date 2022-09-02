/*
* Copyright (C) 2021 Codey Program
*/

import javax.lang.model.util.ElementScanner6;
import java.util.*;

/**
* Methods for operations performed on the 
* Saturated Reverse Polish Notation calculator SRPN
*
* @author Codey Program
* @version 1.1.1
*/
public class SRPN {

     // Create a last in first out (LIFO) stack data structure
     public Stack <Integer> stack = new Stack<>();

     // Create a integer variable called head that will store the current number of stack entries 
     int head;

     /**
     * Generates a random positive integer value. 
     *
     * @param maxInt is object of Integer.MAX_VALUE.
     * @randomNumber random integer is pushed onto the data stack.
     */
     public void random(){
         Random random = new Random();
         int maxInt = Integer.MAX_VALUE; 
         int randomNumber = random.nextInt(maxInt);
         stack.push(randomNumber);   
     }
     
     /**
     * Iterates through the stack elements and prints them out.
     * 
     * @param head stores the current number of stack entries.
     * @result is printed out for all elements in the data stack.
     */
     public void printDataStore(){
         int head = stack.size();
         // If the stack is currently empty print min int value
         if (head==0){
             System.out.println(Integer.MIN_VALUE);
             }
         //iterate through the stack and print values FIFO
         else{
             for(int i=0; i<head ; i++){ 
             //Implement Integer wrapper
             Integer result = stack.get(i); 
             //Print result
             System.out.println(result);   
             }
         }   
     }

     /**
     * Method to implement + operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void plus(){
         int head = stack.size();
         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         // Continue to process the + operation request
         else{
             long input1 = stack.pop();
             long input2 = stack.pop();
             long result = input1 + input2;
             long maxSaturation = Integer.MAX_VALUE;
         // Check the result against max allowed value.
         if (result > maxSaturation){
             stack.push((int)maxSaturation);
             }
         // Push result into the stack
         else {
             stack.push((int)result);
             }
         }
     }

     /**
     * Method to implement - operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void minus(){
        int head = stack.size();
         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         // Process the - operation request
         else {
             long input1 = stack.pop();
             long input2 = stack.pop();
             long result = input2 - input1;
             long minSaturation = Integer.MIN_VALUE;
             // Check the result against min allowed value
             if (result < minSaturation){
                 stack.push((int)minSaturation);
             }
             // Push result into the stack
             else {
                 stack.push((int)result);
             }
         }
     }

     /**
     * Method to implement * operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void multiply(){
         int head = stack.size();
         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         // Process the * operation
         else {    
             long input1 = stack.pop();
             long input2 = stack.pop();
             long result = input2 * input1;
             long maxSaturation = Integer.MAX_VALUE;
             // Check the result against max allowed value
             if (result > maxSaturation){
                 stack.push((int)maxSaturation);
             }
             // Push result into the stack
             else {
                 stack.push((int)result);
            }
         }
     }

     /**
     * Method to implement ^ operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void pow(){
         int head = stack.size();
         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         // Process the ^ operation
         else {    
             long input1 = stack.pop();
             long input2 = stack.pop();
             double result = Math.pow(input2, input1);
             long maxSaturation = Integer.MAX_VALUE;
             // Check the result against max allowed value
             if (result > maxSaturation){
                 stack.push((int)maxSaturation);
             }
             // Push result into the stack
             else {
                 stack.push((int)result);
             }
         }
     }

     /**
     * Method to implement / operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void divide(){
         int head = stack.size();

         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         else{
             // Check the denominator is not equal to 0
             int input1 = stack.pop();
             if (input1 == 0){
                 System.out.println("Divide by 0.");
                 }
             // Process the / operation
             else{
                 int input2 = stack.pop();
                 int result = input2 / input1;
                 // Push result into the stack
                 stack.push((int)result);
             }
         }
     }
     
     /**
     * Method to implement % operation.
     * 
     * @param head stores the current number of stack entries.
     * @result is pushed to the stack after arithmetic is complete.
     */
     public void modulo(){
         int head = stack.size();
         // Check if the stack contains sufficient values
         if (head<=1){
             System.out.println("Stack underflow.");
             }
         // Process the % operation
         else{
             int input1 = stack.pop();
             int input2 = stack.pop();
             long result = input2 % input1;
             stack.push((int)result);
         }
     }

     /**
     * Method to implement = operation.
     * 
     * @param head stores the current number of stack entries.
     * stack.peek is used access the top element of the stack.
     * before being printed to the console. 
     */
     public void equal(){
         int size = stack.size();
         // Check if the stack contains sufficient values
         if (size==0){
             System.out.println("Stack empty.");
             }
         // Process the = operation
         else{
             System.out.println(stack.peek());
         }
    }
    
     /**
     * Processes the operands and operators from user input.
     *
     * @processCommand valid operators are (+,-,*,/,%,^,r,d,=,"",). 
     * Input exceptions are handled with Try/Catch.
     */
     public void processCommand(String s) {
     
         if (s.equals("+")){
         plus();
         }

         else if (s.equals("-")){
         minus();
         }

         else if (s.equals("*")){
         multiply();
         }
    
         else if (s.equals("^")){
         pow();
         }
         
         else if (s.equals("/")){
         divide();
         }
         
         else if (s.equals("%")){
         modulo();
         }
         
         else if (s.equals("d")){
        printDataStore();
         }

         else if (s.equals("r")){
         random();
         } 
    
         else if (s.equals("=")){
         equal();
         }
         // Defend againt the user pressing return key with no input  
         else if (s.equals("")){
          return;}

         // Handle input exceptions with a try/catch statement 
         else {

         try{
         int i = Integer.parseInt(s);
         stack.push(i);}

         // Catch input exception and print error message
         catch(NumberFormatException e){
         System.err.println("Unrecognised operator or operand " + "\""+s+"\""+".");
         }
         }
     }
}



