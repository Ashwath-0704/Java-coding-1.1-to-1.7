import java.util.*;
public class LargestNUmberFromArray {
    public static void main(String[] args) {

        // //Initialize array 
        int n;  
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the size of elements you want to store: ");  
        n=sc.nextInt(); 
        int [] arr = new int [n];//5
        
        System.out.print("Enter the number of array: "); 
        for (int i:arr) {
            arr[i]=sc.nextInt();// {1 2 3 5 4}
        }

        int max = arr[0];  //1
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] > max)  // (1>1)
               max = arr[i];  
        }  
        System.out.println("The largest number present in given array: " + max); //5               
        }
}

 // int i, j, row=n; 

            // for(i=0; i<row; i++)   
            // {   

            //     for(j=0; j<=i; j++)   
            //     {   
            //         System.out.print("* ");   
            //     } 

            // System.out.println();   
            // }