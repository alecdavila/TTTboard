import java.util.*;
public class Tester{
   public static void main(String args[]){
   char x;
   char y;
      
      TTTBoard myBoard= new TTTBoard(4);
      System.out.println(myBoard.size());
      myBoard.set(0,0,'x');
      System.out.println(myBoard.get(0,0));
      myBoard.set(0,1,'x');
      myBoard.set(0,2,'y');
      myBoard.set(0,3,'y');
      myBoard.set(2,0,'x');
      myBoard.set(0,0,'y');
      myBoard.set(1,0,'y');
      System.out.println(myBoard.get(0,1));
      System.out.println(myBoard.get(0,2));
      System.out.println(myBoard.get(0,3));
      System.out.println(myBoard.get(2,0));
      System.out.println(myBoard.get(0,0));
      System.out.println(myBoard.get(1,0));
      
      
   }
}