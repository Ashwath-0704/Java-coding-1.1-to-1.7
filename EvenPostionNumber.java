import java.util.*;
public class EvenPostionNumber {  
    public static void main(String[] args) {  
  
        //Initialize array
        int n;  
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the size of elements you want to store: ");  
        n=sc.nextInt(); 
        int [] arr = new int [n];//5
        
        System.out.print("Enter the number of array: "); 
        for (int a=0;a<arr.length;a++) {
            arr[a]=sc.nextInt();// {1 2 3 5 4}
        } 

        
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2    
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}