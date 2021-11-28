import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {

        // Taking user input 
        Scanner sc = new Scanner(System.in);

        // veriables 
        float a,b,c;
        // String Operator;

        System.out.println("Enter the First number: ");//5
        a = sc.nextFloat();

        System.out.println("Enter the Second number: ");//6
        b = sc.nextFloat();

        System.out.println("Enter the Third number: ");//4
        c = sc.nextFloat();

        float first = a+b*c;//29.0
        float second = c+a/b;//4.8335
        float third = a%b+c;//9.0
        float fourth = a*b+c;//34.0

         System.out.println("Results:-");
         System.out.println("First arithmetic Operation is : "+first);//(a+b*c)
         System.out.println("Second arithmetic Operation is : "+second);//(c+a/b)
         System.out.println("Third arithmetic Operation is : "+third);//(a%b+c)
         System.out.println("fourth arithmetic Operation is : "+fourth);//(a*b+c)


         float arr[]= {first,second,third,fourth};// {29.0,4.8335,9.0,34.0}
         float max = arr[0];//29.0
         float min = arr[0];//29.0

         for (int i = 1; i < arr.length; i++) {
             if (arr[i]>max) {//29.0>4.8335
                 max=arr[i];
            } 
             else if (arr[i]<min){//29.0>4.8335
                 min=arr[i];
            }
             else{
                System.out.println("Invaild number");
            }
        }
         System.out.println("The maximum number from arithmetic Operation is :"+ max);//34.0
         System.out.println("The minimum number from arithmetic Operation is :"+ min);//4.8333335
    }
}
//---------------------------------------( END OF CODE )------------------------------------------------
        // System.out.println("Enter the only one Operator (+ , - , / , * , %): ");
        // Operator= sc.next();

        // switch (Operator) {
        //         case "+":
        //         System.out.printf("%.2f+%.2f=%.2f",a,b,(a+b));
        //         break;
        //         case "-":
        //         System.out.printf("%.2f+%.2f=%.2f",a,b,(a-b));
        //         break;
        //         case "*":
        //         System.out.printf("%.2f+%.2f=%.2f",a,b,(a*b));
        //         break;
        //         case "/":
        //         System.out.printf("%.2f+%.2f=%.2f",a,b,(a/b));
        //         break;
        //         case "%":
        //         System.out.printf("%.2f+%.2f=%.2f",a,b,(a%b));
        //         break;
        //     default:
        //         System.out.println("Enter the valid Operator and Number");
        //         break;
        // }
