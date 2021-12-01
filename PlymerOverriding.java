//PlymerOverriding
//Creating a parent class.  

class Vehicle{  
  //defining a method  
  void automoto(){System.out.println("Vehicle is running");}  
}  

//Creating a child class  
class PlymerOverriding extends Vehicle{  
  
    //defining the same method as in the parent class 
    void automoto(){
      System.out.println("Bike is running safely");
    }  
  
  public static void main(String args[]){ 

        PlymerOverriding read = new PlymerOverriding();//creating object  
        read.automoto();//calling method  
  }  
}