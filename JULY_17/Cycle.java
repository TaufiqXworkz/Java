public class Cycle {
	
	String[] name;
	int[] price;
	short[] mileage;
	float[] wheelSize;
	
	public Cycle() {
		String name1[] = {"Trek", "Giant", "Specialized", "Cannondale"};
		name = name1;
		int price1[] = {500, 750, 1000, 1200}; // dollars
		price = price1;
		short mileage1[] = {50, 60, 70, 80}; // miles per charge or use
		mileage = mileage1;
		float wheelSize1[] = {26f, 27.5f, 28f, 29f}; // inches
		wheelSize = wheelSize1;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(" - " + name[i]);
			System.out.println(" - " + price[i]);
			System.out.println(" - " + mileage[i]);
			System.out.println(" - " + wheelSize[i]); 
		}
	}
}

