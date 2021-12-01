
public class PlymerOverloading {

	void demo(int num1){
	System.out.println("The value of num1 is: "+num1);
	}
	
	void demo(int num1,int num2){
	System.out.println("The value of Number num1 and num2 : (" + num1 + "," +num2 +")");
	}
	
	double demo(Double num1){// using int and Float ????
		System.out.println("The value of Number : "+num1);
		return num1*num1;
	}

    public static void main (String args []){
    	PlymerOverloading calculat1 = new PlymerOverloading();
        calculat1.demo(20);
        calculat1.demo(20, 30);
        System.out.println("Output : " + calculat1.demo(25.0));
    }
}