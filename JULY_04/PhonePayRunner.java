public class PhonePayRunner{

	public static void main(String args[]){
	
		PhonePay.accountValid();
		PhonePay.amountTransact(10000,"TAUFIQ_RAZA");
		PhonePay.amountReceived();
		double[] historyOfTranscation={100.0,15.0,255.0,236,50000};
		PhonePay.transactionHistory(6767,historyOfTranscation);
	
	
	}

}