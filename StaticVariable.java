
class Student{  
    int rollno;  
    String name;  
    static String college ="Reva University";//static variable  
    //constructor  
    Student(int num, String n){  
        rollno = num;  
        name = n;  
    }  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  

 //Test class to show the values of objects  
 public class StaticVariable{  
    public static void main(String args[]){  

        Student Person1 = new Student(29,"Ashwath Naidu");  
        Student Person2 = new Student(2,"Chanti"); 

        Person1.display();  
        Person2.display();  
  }  
 }  