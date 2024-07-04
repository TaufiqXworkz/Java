public class AmazonRunner{

	public static void main(String args[]){
	
		Amazon.primeVideo();
		Amazon.primeMusic("Teri meri kahani");
		Amazon.amazonPay();
		String[] itemNames={"T-shirt","shoes","bag","googles"};
		Amazon.primeShopping(itemNames,5000);
	
	
	}

}