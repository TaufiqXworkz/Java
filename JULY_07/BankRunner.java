public class BankRunner {
    public static void main(String[] args) {
        Bank.initializeVariables();
        Bank.displayAccountInfo("John", 2450.75);
        Bank.getServices();
        System.out.println("Transactions for John :");
		Bank.getAccountTransactions("John");
        
    }
}