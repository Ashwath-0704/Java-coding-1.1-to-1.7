// DEFAULTCONSTRUTOR

class DefaultConstrutor{  
    int id;  
    String name; 
    int Marks; 
    void display()
    {
        System.out.println(id+" "+name+" "+Marks);
    }  
      
    public static void main(String args[]){ 

        DefaultConstrutor person1=new DefaultConstrutor();  
        DefaultConstrutor person2=new DefaultConstrutor();  

            person1.display();  
            person2.display();  
        }  
    }  