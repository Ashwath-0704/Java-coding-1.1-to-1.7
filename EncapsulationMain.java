// public class EncapsulationMain
public class EncapsulationMain {  
    public static void main(String[] args) {  

        Encapsulation acc=new Encapsulation();  

        //setting values through setter methods  
            acc.setAcc_no(7560504000L);  
            acc.setName("Sonoo Jaiswal");  
            acc.setEmail("Ashwath.bly@gamil.com");  
            acc.setAmount(500000f);  
            acc.setIFSC_Code(846531);  
        //getting values through getter methods  
        System.out.println("Account Number | "+acc.getAcc_no()+"\n"+"Name | "+acc.getName()+"\n"+"Gmail | "+acc.getEmail()+"\n"+"Balance | "+acc.getAmount()+"\n"+"IFSC CODE | "+acc.getIFSC_Code());  
    }  
}  