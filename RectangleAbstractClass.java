import java.util.*;
abstract class Shape{  
    abstract void calculateArea();
}  

class RectangleAbstractClass extends Shape{  

  void calculateArea(){
    int l,w;  
    Scanner sc=new Scanner(System.in); 

    System.out.print("Enter the Length in meters : ");  
        l=sc.nextInt();
    System.out.print("Enter the Width in meters : ");  
        w=sc.nextInt();

        int length = l;
      int width = w;
      float AreaOfRectangle = length* width;
      System.out.println(" ");
      System.out.println("Shape ---> Rectangle");
      System.out.println(" ");
      System.out.println("The area of rectangle for length ("+length+ "m) and width ("+width+ "m) is : "+ AreaOfRectangle);
      System.out.println(" ");
    }  
  public static void main(String args[]){ 

    Shape Area1 = new RectangleAbstractClass();  
        Area1.calculateArea();
  }  
}