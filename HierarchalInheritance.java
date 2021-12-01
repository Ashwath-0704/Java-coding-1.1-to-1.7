//1
class mam {
    void eat(){System.out.println("eating...");}  
}  
//2 this class extending with only mam
class Dog extends mam{  
void bark(){System.out.println("barking...");}  
}
//2 this class extending with only mam (not with dog)
// we only access the data store in mam 
// test2.eat() 
class Cat extends mam{  
void meow(){System.out.println("meowing...");}  
}
// Applying class 
class HierarchalInheritance{  
    public static void main(String args[]){  
        Cat test2=new Cat();  
        test2.meow();  
        test2.eat();  
        // test2.bark();// Gives an Error  
    }   
}  