// If you make any variable as final, you cannot change the value of final variable(It will be constant)
class FinalVariable{  

    final int TimeLimit=90;//final variable  
    
    void Time(){  
     TimeLimit=400;  
    }  
    
    public static void main(String args[]){  
        FinalVariable Limit = new  FinalVariable();  
        Limit.Time();  
        }  
   }//end of class  
