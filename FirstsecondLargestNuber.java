import java.util.*;  
public class FirstsecondLargestNuber{    
    public static void main(String args[]){  
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements size: ");
    n = sc.nextInt();
    int arr[] = new int[n];//10
    
    System.out.println("Enter the array elements: ");
    for (int i = 0; i <n; i++) 
        arr[i]= sc.nextInt();// 1 2 3 4 5 6 7 8 9 10


    int temp;
    for (int i = 0; i < n; i++) {//0
        for (int j = i+1; j < n; j++) {//1
            if (arr[i]>arr[j]) {//(1>2)

                temp= arr[i];//1
                arr[i]=arr[j];//2
                arr[j]=temp;//1
            }    
        }
        
    }

    System.out.println("Array elements after sorting");
    for (int i = 0; i < n; i++) {
        System.out.println(" "+arr[i]);
    }
System.out.print("Seconf largest number in give array is: "+arr[n-2] );//

    // int a[]={1,2,5,6,3,2};  
// System.out.println("Second Largest: "+getSecondLargest(a,6));  
    }
}  