//Alec Davila 0511
//CSC 20
//Professor Krovetz 
//Project 2
import java.util.*;

/** A class representing a tic-tac-toe board user can pass the constructor
  * the size board they want to use, or default size is 3 and this will also
  * output the board itself
  *
  *
  *
  * @author Alec Davila
  * @version 2 March 2019
  */
public class TTTBoard{
   
   char [][] Board = new char [DEFAULT_SIZE][DEFAULT_SIZE];
   public static final int DEFAULT_SIZE = 3;
   
   /**
     * Initiallizes a new TTTBoard with its size. 
     * The size cannot be less than 1
     *
     * @throws IllegalArgumentException if size is less than 1
     * @param size sets the size of the TTTBoard's dimensions
     *
     */
   public TTTBoard(int size){
      if(size < 1){
         throw new IllegalArgumentException ("Size cannot be less that 1");
      }
      this.Board = new char[size][size];
   }
   
   /**
     * Sets the TTTboard to its default size with it being 3
     *
     */
   public TTTBoard(){
   }
   
   /**
     * Returns the character at position (r,c)
     * if no character returns ' '
     * @param r will give position of charcter in array
     * @param c will also give position of character in the array
     * @return result which is the character in question
     */
   public char get(int r, int c){
      char result = Board [r][c];
      return result;
   
   }
   
   /**
     * Sets the position (r,c) in the array to a character chosen
     * The value will be > 1
     *
     * @param r is the location of the charater ch
     * @param c is the location of the character ch
     * @param ch is the character put in the place of (r,c)
     * @throws IndexOutOfBoundsException if size is less than 1
     *
     */
   public void set(int r, int c, char ch){
      if(Board.length < r){
         throw new IndexOutOfBoundsException("Index " + r + " is out of bounds!");
      }
      else if(Board.length < c){
         throw new IndexOutOfBoundsException("Index " + c + " is out of bounds!");
      }
      else{
         Board[r][c] = ch;
      }
   
   
   }
  
    /**
     * This Method returns the size of the Board in question
     *
     * @return Board.length which should either be the size entered to 
     * the constructor or a default size of 3
     */     
   public int size(){
      return Board.length;
   }

   /**
     * Incriments through TTTBoard to find if there is a winning board in play
     * if board is size 3 then there has to be 3 of the same character in a row to win
     * It will test rows/ columns and diagonals
     *
     *@return X if the x character won the board
     *@return O if the o character won the board
     *
     */
   public char winner(){
      // check rows
      for (int i = 0; i < Board.length; i++)
      {  
         char p = Board[i][0];
         boolean same = true;
         for (int j = 1; j < Board.length && same; j++)
         {
            if (p != (Board[i][j]))
               same = false;
         }
         if (same) 
            return p;
      }
      // check columns
      for (int i = 0; i < Board.length; i++)
      {  
         char p = Board[0][i];
         boolean same = true;
         for (int j = 1; j < Board.length && same; j++)
         {
            if (p != (Board[j][i]))
               same = false;
         }
         if (same) 
            return p;
      }
      // check diagonals
      char p = Board[0][0];
      boolean same = true;
      for (int j = 1; j < Board.length && same; j++)
      {
         if (p != (Board[j][j]))
            same = false;
      }
       
      if (same) 
         return p;
       
      p = Board[0][Board.length - 1];
      same = true;
       
      for (int j = 1; j < Board.length && same; j++)
      {
         if (p != (Board[j][Board.length - 1 - j]))
            same = false;
      }
      if (same) 
         return p;
      return ' ';
   }   
  
     /**
     * Incriments through TTTBoard to display the internal contents and board values.
     * 
     * 
     *
     *@return result returns the string form of the board based on the content and
     * board size
     *
     */
   public String toString(){
      String result = "";
      for (int i = 0; i < Board.length; i++)
      {
         result = result + "|";
         for (int j = 0; j < Board.length; j++)         
            result = result + Board[i][j];
         result = result + "|\n-+-+-\n";
      }
      return result;
   
   }
}