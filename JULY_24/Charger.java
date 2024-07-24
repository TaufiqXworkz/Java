/*2. declare a class to achieve constructor overloading and chaining */


public class Charger{

	public Charger(){
		//constructor chaining
		this("Iphone",3500);
		System.out.println("Charger Details");
	}
	
	public Charger(String name){
		System.out.println("Charger Name is:"+name);
	}
	
	public Charger(String name,int price){
		System.out.println("Charger Name is:"+name);
		System.out.println("Charger Price is:"+price);
	}

}