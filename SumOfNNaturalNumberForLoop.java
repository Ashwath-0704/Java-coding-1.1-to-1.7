import java.util.*;

public class SumOfNNaturalNumberForLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

        System.out.println("Enter the number: "); 
        number = sc.nextInt(); // 5
        
        for (int i = 0; i <= number; i++) {
            sum+=i;
        }
        System.out.println("The sum if N natural is "+sum);
    }
}
