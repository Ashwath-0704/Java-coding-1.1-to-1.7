class place {
    void hidding(){System.out.println("hidding...");}  
}  

class Dog extends place{  
    void Going(){System.out.println("Going...");}  
}  

class SingleInheritance{  
    public static void main(String args[]){  
        Dog test=new Dog();  
        test.Going();  
        test.hidding();  
    }
} 
