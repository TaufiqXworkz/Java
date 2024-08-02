class BankRunner{

	public static void main(String args[]){
		Bank bank = new Bank();
		
		bank.setBankHolderName("Taufiq Raza");
		String BankHolderName=bank.getBankHolderName();
		
		bank.setBankName("Karnataka Bank");
		String BankName=bank.getBankName();
		
		bank.setAccountNumber(6072581145L);
		long AccountNumber=bank.getAccountNumber();
		
		bank.setBankBalance(10000);
		int Balance= bank.getBankBalance();
		
		bank.setAdharCard(4912086466L);
		long AdharCard=bank.getAdharCard();
		
		//method 1
		System.out.println("======Method1=======");
		bank.accountNumberCheck(6541236548L);
		
		//method 2
		System.out.println("======Method2=======");
		long AdharLength=bank.adharNumberCheck(4912086466L);
		System.out.println("AdharLength:"+AdharLength);
		
		//method 3
		System.out.println("======Method3=======");
		bank.bankBalanceCheck(15000,"Raza","RBI");
		
		//method 4
		System.out.println("======Method4=======");
		bank.withdrawAmount(20000);
	}

}