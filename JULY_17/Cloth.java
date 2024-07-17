public class Cloth {
	
	String[] name;
	int[] price;
	String[] size;
	String[] material;
	
	public Cloth() {
		String name1[] = {"Shirt", "Pants", "Jacket", "T-shirt"};
		name = name1;
		int price1[] = {50, 70, 100, 30}; // dollars
		price = price1;
		String size1[] = {"M", "L", "XL", "S"};
		size = size1;
		String material1[] = {"Cotton", "Denim", "Leather", "Polyester"};
		material = material1;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(" - " + name[i]);
			System.out.println(" - " + price[i]);
			System.out.println(" - " + size[i]);
			System.out.println(" - " + material[i]); 
		}
	}
}

	
