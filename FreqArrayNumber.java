// import java.util.*;
public class FreqArrayNumber {  
    public static void main(String[] args) {  
        //Initialize array 
        // int n;  
        // Scanner sc=new Scanner(System.in); 

        // System.out.print("Enter the size of array you want to store: ");  
        // n=sc.nextInt(); 
        // int [] arr = new int [n];//5
        
        // System.out.print("Enter the number of array: "); 
        // for (int i:arr) {
        //     arr[i]=sc.nextInt();// {1 2 3 5 4}
        // }
        
        int [] arr = new int [] {1,2,1,1,5};  
        int [] fr = new int [arr.length];  
        int visited = -1;  

        for(int i = 0; i < arr.length; i++){  
                int count = 1;  

                for(int j = i+1; j < arr.length; j++){  

                    if(arr[i] == arr[j]){  
                        count++;  
                        //To avoid counting same element again  
                        fr[j] = visited;  
                    }  
                }  
                if(fr[i] != visited)  
                    fr[i] = count;  
            }  

        for(int i = 0; i < fr.length; i++)
            {  
                if(fr[i] != visited)  
                System.out.println( arr[i] + " had occured " + fr[i]);              
             }  
    }
}  