
public class PassByValue { 

    int a=100;     

    void change(int num1){
            
        num1+=100; //Changing values  It will be locally)   
    }

    public static void main(String args[]){    
      PassByValue PBV =new PassByValue();  //Creating object 

        System.out.println(" Value (before change)="+PBV.a); //100
      
        PBV.change(200);  //Passing value  
        System.out.println(" Value (after change)="+PBV.a); //100
    }    
   }  