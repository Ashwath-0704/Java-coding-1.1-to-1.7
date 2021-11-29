import java.util.*;
public class DuplicateNumberInArray {  
    public static void main(String[] args) {      
          
        //Initialize array
        int n;  
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter the size of elements you want to store: ");  
            n=sc.nextInt(); 
            int [] arr = new int [n];//10
        
        System.out.print("Enter the number of array: "); 
            for (int a=0;a<arr.length;a++) {
                arr[a]=sc.nextInt();// {1 2 3 2 2 2 4 4 5 5}
            }
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
            for(int i = 0; i < arr.length; i++) {  //1

                for(int j = i + 1; j < arr.length; j++) {  // {2 3 2 2 2 4 4 5 5}

                    if(arr[i] == arr[j])

                        System.out.println(arr[j]);  
            }  
        }  
    }  
}  