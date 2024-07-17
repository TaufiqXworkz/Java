public class Mobile {
	
	String[] name;
	int[] price;
	short[] batteryLife;
	float[] screenSize;
	
	public Mobile() {
		String name1[] = {"iPhone", "Samsung", "OnePlus", "Google Pixel"};
		name = name1;
		int price1[] = {999, 899, 699, 799}; // dollars
		price = price1;
		short batteryLife1[] = {20, 22, 18, 24}; // hours
		batteryLife = batteryLife1;
		float screenSize1[] = {6.1f, 6.5f, 6.4f, 6.0f}; // inches
		screenSize = screenSize1;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(" - " + name[i]);
			System.out.println(" - " + price[i]);
			System.out.println(" - " + batteryLife[i]);
			System.out.println(" - " + screenSize[i]); 
		}
	}
}


