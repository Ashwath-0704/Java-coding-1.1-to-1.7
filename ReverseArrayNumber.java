import java.util.*;
public class ReverseArrayNumber {  
    public static void main(String[] args) { 

        int n;  
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the size of elements you want to store: ");  
        n=sc.nextInt(); 
        int [] arr = new int [n];//5
        
        System.out.print("Enter the number of array: "); 
        for (int a=0;a<arr.length;a++) {
            arr[a]=sc.nextInt();// {1 2 3 5 4}
        }
          
        System.out.println("Array in reverse number is: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {   
            System.out.print(arr[i] + " ");   
        }    
    }  
}  