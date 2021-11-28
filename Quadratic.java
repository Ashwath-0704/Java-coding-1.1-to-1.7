import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter the value of A: ");// 2
        Double a =scanner.nextDouble();

        System.out.println("Enter the value of B: ");//11
        Double b =scanner.nextDouble();

        System.out.println("Enter the value of C: ");//5
        Double c =scanner.nextDouble();

        Double Root1; 
        Double Root2;
        Double Discriminate= b*b-4*a*c;//81
        System.out.println("Roots are Discriminate: "+Discriminate);//81

        if(Discriminate<0) {//False
            
            System.out.println("Roots are imaginary");
            Root1=0.0;
            Root2=0.0;
            System.out.println("Root1 : "+ Root1);
            System.out.println("Root2 : "+ Root2);
        }

        else if(Discriminate==0) {//False

            System.out.println("Roots are equal.");
            Root1 = -b /(2*a);
            Root2 = -b /(2*a);
            System.out.println("Root1 : "+ Root1);
            System.out.println("Root2 : "+ Root2);
        }

        else if (Discriminate>0) {//True

            System.out.println("Roots are not equal.");
            Root1 = (-b + Math.sqrt(Discriminate))/(2*a);
            Root2 = (-b - Math.sqrt(Discriminate))/(2*a);
            System.out.println("Root1 : "+ Root1);//-0.5
            System.out.println("Root2 : "+ Root2);//-5.0
        }
    }
}
