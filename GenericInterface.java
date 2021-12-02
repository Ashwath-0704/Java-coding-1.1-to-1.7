/**
 * Defining Generic Interface
 */
interface Math<T extends Number> {
    int powerOf(T t);
}

/**
* Power Of Five
 */
class PowerOfFive<T extends Number> implements Math<T>{

    public int powerOf(T i) {
        return i.intValue()*i.intValue()*i.intValue()*i.intValue()*i.intValue();
    }
}
/**
 * main GenericInterface
 */
public class GenericInterface {
    public static void main(String[] args) {
        
        PowerOfFive<Float>pFive = new PowerOfFive<Float>();
        System.out.println("The 5 power of 5 is : "+pFive.powerOf(2f));
    }
}