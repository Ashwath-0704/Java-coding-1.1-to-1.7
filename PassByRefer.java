
public class PassByRefer {
     
    /*
     *  The original value of 'a' will be changed as we are trying
     *  to pass the objects. Objects are passed by reference.
     */
     
    int a = 210;

    void changeTo(PassByRefer num1) {
        num1.a +=20;
    }
     
    public static void main(String[] args) {

        PassByRefer PBR = new PassByRefer();
        System.out.println("Before call-by-reference: " + PBR.a);
         
        // passing the object as a value using pass-by-reference
        PBR.changeTo(PBR);
        System.out.println("After call-by-reference: " + PBR.a);
         
         
    }
}