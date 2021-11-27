// When you don't assign value to variables while declaring 
// then java provides these variables a default value.

// Default value of an object in java is null.

// Note:- Local variables are never assigned default value by compiler

class Datatypes {
	
	int number;
	double Twonumber;
	float NumberWithDot;
	boolean istrue;
	String OnlyChar;

	public void printValue() {
		System.out.println("int default value = "+ number);
		System.out.println("double default value = "+ Twonumber);
		System.out.println("float default value = "+ NumberWithDot);
		System.out.println("boolean default value = "+ istrue);
		System.out.println("String default value = "+ OnlyChar);
	}
}

public class PrimitiveDatatypes {
    public static void main(String argv[]) {
		Datatypes test = new Datatypes();
		test.printValue();
	}
}
