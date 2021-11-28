
import java.util.*;
public class SpringSeason {
    public static void main (String[] args){
  
      Scanner in = new Scanner(System.in);
      int month;
      int day;
    
      System.out.print("Please enter month and day: ");
      month = in.nextInt();//4
      day = in.nextInt();//21

      if (month >= 3 && month <=6 && day>= 20) { // 4-21
            System.out.println("True");//True
            System.out.println("The given month and date lies between 20th, March and 20th, June");
        } 
      else {
            System.out.println("False");
            System.out.println("The given month and date does not lies between20th, March and 20th, June");
        }
     } // main body
  }
