import java.util.*;

public class ReverseTheNumberusingForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rev = 0;
        System.out.println("Enter the number: "); 
        num = sc.nextInt(); // 123456
        
        for(;num != 0; num /= 10) {  //123456 //12345 // 1234 // 123 // 12 // 1 
            int digit = num % 10;    //6 // 5 // 4 // 3 // 2 // 1 //
            rev = rev * 10 + digit;  //6 // 5 // 4 // 3 // 2 // 1 //
          }  
          
        System.out.println("The reversed number: " + rev); 
            
    }
}
