// public class SuperKeyword {
    
// }
class Person{  
    int id;  
    String name;  
    Person(int id,String name){  
        this.id=id;  
        this.name=name;  
    }  
}  
class Emp extends Person{  
    float salary;  
    Emp(int id,String name,float salary){  
        super(id,name);//reusing parent constructor  
        this.salary=salary;  
    }  
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }  
}  

class PMP extends Emp{
    float PF_amt;
    PMP(int id,String name,float salary,float PF_amt){
        super(id, name, salary);//reusing parent constructor
        this.PF_amt=PF_amt;
    }
    void display(){
        System.out.println(id+"\n"+name+"\n"+salary+"\n"+PF_amt);
    }
}

class SuperKeyword{  
    public static void main(String[] args){  
        PMP Emply1 = new PMP(1,"ankit",45000f,864145);  
        Emply1.display();  
    }
} 