
class Encapsulation {  
    //private data members  
    private long acc_no;  
    private String name,email;  
    private float amount;
    private long IFSC_Code;
    //public getter and setter methods
    //Get Account  
        public long getAcc_no() {  
            return acc_no;  
        }  
    //Set Account  
        public void setAcc_no(long acc_no) {  
            this.acc_no = acc_no;  
        }  
    //Get Name  
        public String getName() {  
            return name;  
        }  
    //Set Name  
        public void setName(String name) {  
            this.name = name;  
        }  
    //Get Email ID
        public String getEmail() {  
            return email;  
        }  
    //Set Email ID
        public void setEmail(String email) {  
            this.email = email;  
        }  
    //Get Amount Balance
        public float getAmount() {  
            return amount;  
    }  
    //Set Amount Balance
        public void setAmount(float amount) {  
            this.amount = amount;  
        }  
    // Get IFSC CODE
        public long getIFSC_Code() {
            return IFSC_Code;
        }
      
        public void setIFSC_Code(long IFSC_Code) {
            this.IFSC_Code = IFSC_Code;
        }
}  
