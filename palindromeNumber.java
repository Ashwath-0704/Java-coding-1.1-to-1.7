
import java.util.*;
public class palindromeNumber {
    public static void main(String[] args) {  

      String original, rev = ""; // Objects of String class  

      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number");  
      original = in.nextLine();   
// finding the length of the number/string 
      int length = original.length();

      for ( int i = length - 1; i >= 0; i-- ){
        rev = rev + original.charAt(i); 
      } 
// we are compareing b/w the revarsed number/string with original number/string.
      if (original.equals(rev)){
        System.out.println("Entered string/number is a palindrome.");
      } 
      else{
        System.out.println("Entered string/number is not a palindrome.");   
      }  
    }
}
