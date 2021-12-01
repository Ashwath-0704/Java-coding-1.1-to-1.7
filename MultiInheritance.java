//1
class Breakfast {
    void eat(){System.out.println("eating...");}  
}  
//2
class Dog extends Breakfast{  
    void bark(){System.out.println("barking...");}  
}  
//3
class BabyDog extends Dog{  
    void weep(){System.out.println("weeping...");}  
}  
// Applying class 
class MultiInheritance{  
public static void main(String args[]){ 
            
        BabyDog test1=new BabyDog();  
        test1.weep();  
        test1.bark();  
        test1.eat();  
    }   
}  