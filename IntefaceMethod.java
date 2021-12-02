// IntefaceMethod 

interface printable{  
    void print();  
    }  

class IntefaceMethod implements printable{  
    public void print(){
        System.out.println("Hello");
    }  
            
    public static void main(String args[]){  
        IntefaceMethod message = new IntefaceMethod();  
        message.print();  
     }  
    }  