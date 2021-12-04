
class SavingAccount {

    public static double annualInterestRate;
    private double savBalance;

    // // saving account init

    // Each object of the class contains a private instance variable savingsBalance
    // indicating the amount the saver currently has on deposit.

    public SavingAccount() {
        annualInterestRate = 0.0;
        savBalance = 0.0;
    }
    
    public SavingAccount(double rate, double bal) {
        annualInterestRate = rate;
        savBalance = bal;
    }
//Provide method calculateMonthlyInterest to calculate the monthly interest by
// multiplying the savingsBalance by annualInterestRate divided by 12 this
// interest should be added to savingsBalance. 
// Provide a static method
// modifyInterestRate that sets the annualInterestRate to a new value.

    public double calculateMonthlyInterest() {
            double rate = (savBalance * annualInterestRate/12);
            savBalance += rate;
            return rate;
    }

    // getter and setter method
    public static void modifyInterestRate(double newInteresRate) {
        annualInterestRate = newInteresRate;
    }

    //get savingbal
    public double getSavingsBalance() {
        return savBalance;
    }

    //set savingbal 
    public void setBalance(double newBal) {
        savBalance = newBal;
    }
    
    //Get AnnualInterestRate 
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    // Write a program to test class SavingsAccount.
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount();
        SavingAccount s2 = new SavingAccount();

            s1.setBalance(2000.0);
            s2.setBalance(3000.0);
    SavingAccount.modifyInterestRate(0.04);
    //after changing rate to 4%
            s1.calculateMonthlyInterest();
            s2.calculateMonthlyInterest();
    // System.out.print(" ");
    System.out.printf("New Balance for S1=%f\n",s1.getSavingsBalance());
    System.out.printf("New Balance for S2=%f\n",s2.getSavingsBalance());
    // System.out.printf("amount differ id deff=%f\n",sav);
    // System.out.print("");

    SavingAccount.modifyInterestRate(0.05);
    //after changing rate to 5%
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
    
        // System.out.print("");
        System.out.printf("New Balance for S1=%f\n",s1.getSavingsBalance());
        System.out.printf("New Balance for S2=%f\n",s2.getSavingsBalance());
    System.out.print(" ");
    
    
    }
}