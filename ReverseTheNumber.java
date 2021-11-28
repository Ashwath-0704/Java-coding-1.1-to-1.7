
import java.util.*;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, rev = 0;
        System.out.println("Enter the number: "); 
        number = sc.nextInt(); // 123456  

        while (number!=0) {
            int remainder = number % 10; //6 
            rev = rev * 10 + remainder; //6
            number=number/10; //12345
        }  
        System.out.println("The reverse of the given number is: " + rev);
    }
}
