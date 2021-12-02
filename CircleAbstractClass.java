import java.util.*;
abstract class shape{
    abstract void CalculateArea(); 
}

class CircleAbstractClass extends shape {
   void CalculateArea(){
    int n;  
    Scanner sc=new Scanner(System.in); 

    System.out.print("Enter the radius in meters : ");  
        n=sc.nextInt(); 

       final float pi = 3.78f;
       float radius = n;
       float AreaOfCircle=pi * radius;
       System.out.println(" ");
        System.out.println("Shape ---> Circle");
        System.out.println(" ");
        System.out.println("The area of Circle for radius ("+radius+") is : "+ AreaOfCircle);
      System.out.println(" ");
   }
   public static void main(String[] args) {
    
       shape Area1 = new CircleAbstractClass();
       Area1.CalculateArea();
   } 
}
