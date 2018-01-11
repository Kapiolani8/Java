public class BankAccountTest{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        
        System.out.println("The bank account number for this account is : " + account1.getAccountNumber());
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.depositChecking(100);
        account1.depositSavings(10000);
        account1.withdrawalChecking(50);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawalSavings(75);
        System.out.println(account1.getSavingsBalance());
        account1.total();
        System.out.println("The total amount in both the checking and savings accounts for this account is : $" + account1.total());
        

        // System.out.println("The current amount in the Checking Account is : " + account1.getCheckingBalance());
        // System.out.println("The current amount in the Savings Account is : " + account1.getSavingsBalance());
    }
}