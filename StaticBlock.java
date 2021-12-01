// StaticBlock

class StaticBlock{
    static int num;
    static String mystr;
    
    //First Static block
    static{
       System.out.println("Static Block 1");
       num = 68;
       mystr = "Block1";
     } 
   //Second static block
   static{
       System.out.println("Static Block 2");
       num = 98;
       mystr = "Block2";
     }
   //Thired static block
    static{
        System.out.println("Static Block 3");
        num=50;
        mystr="Block 3";
    }
   public static void main(String args[])
   {
       System.out.println("Value of num: "+num);
       System.out.println("Value of mystr: "+mystr);
    }
 }