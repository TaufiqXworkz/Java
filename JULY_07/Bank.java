public class Bank {
    public static void initializeVariables() {
        String bankName = "National Bank";
        int totalBranches = 120;
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Branches: " + totalBranches);
    }

    public static void displayAccountInfo(String accountHolder, double accountBalance) {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: $" + accountBalance);
    }

    public static String[] getServices() {
        String[] services = {"Savings Account", "Current Account", "Fixed Deposit", "Loans"};
		System.out.println("the Services are: ");
		for(int i =0 ; i<services.length ; i++ ){
			System.out.println("- "+services[i]);
		}
        return services;
    }

    public static double[] getAccountTransactions(String accountHolder) {
        double[] transactions = {500.0, -200.0, 1500.0, -100.0};
		System.out.println("the Services are: ");
		for(int i =0 ; i<transactions.length ; i++ ){
			System.out.println("- "+transactions[i]);
		}
        return transactions;
    }
}

