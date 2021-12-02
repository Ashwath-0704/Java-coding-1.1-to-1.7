/**
 * InterfaceImp
 * Iterface 
 */
interface Banks {
    float RateOfIntrest();    
}
/**
 * SBI Bank
 */
class SBI implements Banks {

    public float RateOfIntrest(){
        return 13.0f;
    }
}
/**
 * IDFC Bank
 */
class IDFC implements Banks{
    public float RateOfIntrest(){
        return 9.5f;
    }
}
/**
 * ICIC Bank
 */
class ICIC implements Banks {
    public float RateOfIntrest(){
        return 8.5f;
    }
}
/**
 * Testing class  
 */
class InterfaceImp {
   public static void main(String[] args) {
        //implimenting with different banks 
    Banks bank1=new SBI();
    Banks bank2=new ICIC();
    Banks bank3=new IDFC();

    // Diplaying the output 
    System.out.print("The"+" "+bank1+" "+"Rate of intrest is "+bank1.RateOfIntrest()+"\n");
    System.out.print("The"+" "+bank2+" "+"Rate of intrest is "+bank2.RateOfIntrest()+"\n");
    System.out.print("The"+" "+bank3+" "+"Rate of intrest is "+bank3.RateOfIntrest()+"\n");
   }
}    