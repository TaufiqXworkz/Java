public class SimCard {
	
	String[] name;
	int[] price;
	int[] validity;
	float[] data;
	
	public SimCard() {
		String name1[] = {"Jio", "Airtel", "BSNL", "Vi"};
		name = name1;
		int price1[] = {30, 25, 20, 15}; // dollars
		price = price1;
		int validity1[] = {30, 28, 25, 20}; // days
		validity = validity1;
		float data1[] = {10f, 8f, 12f, 5f}; // GB
		data = data1;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(" - " + name[i]);
			System.out.println(" - " + price[i]);
			System.out.println(" - " + validity[i]);
			System.out.println(" - " + data[i]); 
		}
	}
}

