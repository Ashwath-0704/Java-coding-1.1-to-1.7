// ParameterziedConstrutor 

class ParameterziedConstrutor{  
    int id,marks;  
    String name;  
    // creating objects
    ParameterziedConstrutor(int i, int m,String n){  
        id = i;  
        name = n; 
        marks= m; 
    }  
// Displaying
    void display()
    {
        System.out.println(id+" "+marks+" "+name);
    }  
    public static void main(String args[]){  

        ParameterziedConstrutor Person1 = new ParameterziedConstrutor(111,100,"Karan");  
        ParameterziedConstrutor Person2 = new ParameterziedConstrutor(222,80,"Aryan");  

        Person1.display();  
        Person2.display();  
   }  
}  
