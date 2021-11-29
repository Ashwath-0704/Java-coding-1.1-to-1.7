import java.util.*;
public class SmallestNumberOfArray {
    public static void main(String[] args) {

        // //Initialize array 
        int n;  
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the size of elements you want to store: ");  
        n=sc.nextInt(); 
        int [] arr = new int [n];//5
        
        System.out.print("Enter the number of array: "); 
        for (int a=0;a<arr.length;a++) {
            arr[a]=sc.nextInt();// {1 2 3 5 4}
        }
        int min = arr[1];  //1
        for (int i = 1; i < arr.length; i++) {

           if(min > arr[i])  // (1>1)
               min = arr[i];  
        }  
        System.out.println("The smallest number present in given array: "+ min); //1            
        }
}