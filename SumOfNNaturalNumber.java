import java.util.*;
public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        // Taking User input
       Scanner sc = new Scanner(System.in);
       int number, sum = 0, NumberOfloops=1;
       System.out.println("Enter the number: "); 
       number = sc.nextInt(); // 5

       while (NumberOfloops<=number) {
           sum+=NumberOfloops;
           NumberOfloops++;
       }
       System.out.println("The sum if N natural is "+sum); 
    }
}