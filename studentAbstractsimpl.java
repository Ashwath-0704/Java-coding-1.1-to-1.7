// public class studentAbstractsimpl {
    
// }
import java.util.*;
import java.util.function.LongFunction;
interface GFG {
	void CollegeID();
	void Branch();
	void Ranks();
}

abstract class Student implements GFG {
	// Overriding two methods of the interfacem,GFG
	@Override public void CollegeID(){
        String ID;  
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the college ID number : ");  
        ID =sc.next(); 
        System.out.println("College ID - "+ID);
	}
	@Override public void Branch(){
        String B;  
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the Branch : ");  
        B=sc.next(); 
		System.out.println("The Branch is :"+B);
	}
}
// creating an non-abstract class
// GEEK which is extending Student
class GEEK extends Student {
	
	// overriding the remaining method of the interface,GFG
	@Override public void Ranks(){
        int R;  
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the last exam rank  : ");  
            R=sc.nextInt(); 
		System.out.println("The Last exam rank is : "+ R);
    }
}
// Implemention of Interface using Abstract Class in Java
// Driver code
public class studentAbstractsimpl {

	public static void main(String[] args)
	{
		// New GEEK object is created
		GEEK Student1 = new GEEK();
		    System.out.println(" ");
		// Calls to the multiple functions
		    Student1.CollegeID();
		System.out.println(" ");
		    Student1.Branch();
		System.out.println(" ");
		    Student1.Ranks();
		System.out.println(" ");
	}
}

