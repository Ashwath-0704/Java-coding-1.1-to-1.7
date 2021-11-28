import java.util.Scanner;
import java.util.*;
public class NumberAndDisplayUnitsTens {
    public static void main(String[] args) {
        // Taking user input 
        Scanner sc = new Scanner(System.in);
        // veriables 
        int num1, num2, num3, num4, num5; 
        System.out.println("Enter the number: ");
        num1 = sc.nextInt(); // 8951
        // Finding the places in given number  
        if (num1<=0 || num1>=10000) {
            System.out.println("Invalid number try again ");
        } else {
            num2 = num1%10; //1
            num3 = num1%100/10; //5
            num4 = num1%1000/100; //9
            num5 = num1%10000/1000; //8
            System.out.println("The number in Units place is : "+ num2);
            System.out.println("The number in Tens place is : "+ num3);
            System.out.println("The number in Hundreds place is : "+ num4);
            System.out.println("The number in Thousand place is : "+ num5);   
        }
    }
}