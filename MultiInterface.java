// public class MultiInterface 
interface Printable{  
    void print();  
}  

interface Showable{  
    void print();  
}  
      
class MultiInterface implements Printable, Showable{  
    public void print(){
        System.out.println("Hello");
    }  
    public static void main(String args[]){  
        MultiInterface message = new MultiInterface();  
        message.print();  
    }
}  