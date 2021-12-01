class Inheritance1 {
    float salary=40000;  
}  
//this will extend with mentioned class name will collabrate
class Inheritance extends Inheritance1{  
 int bonus=10000; 

    public static void main(String args[]){ 
//using class name and create variable and calling class 
        Inheritance p=new Inheritance();  
        System.out.println("Programmer salary is:"+p.salary);  
        System.out.println("Bonus of Programmer is:"+p.bonus);  
    }  
}  