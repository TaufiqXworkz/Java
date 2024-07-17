public class Car {
	
	String[] name;
	int[] price;
	short[] mileage;
	float[] engineCapacity;
	
	public Car() {
		String name1[] = {"Toyota", "Honda", "Ford", "Chevrolet"};
		name = name1;
		int price1[] = {20000, 25000, 30000, 35000}; // thousands
		price = price1;
		short mileage1[] = {25, 30, 20, 22}; // miles per gallon
		mileage = mileage1;
		float engineCapacity1[] = {1.8f, 2.0f, 2.5f, 3.0f}; // liters
		engineCapacity = engineCapacity1;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(" - " + name[i]);
			System.out.println(" - " + price[i]);
			System.out.println(" - " + mileage[i]);
			System.out.println(" - " + engineCapacity[i]); 
		}
	}
}

