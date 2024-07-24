/*3. declare a class to achieve static method overloading and chaining */

public class Watch{

	public static void watchDetails(){
		System.out.println("Watch Details");
		
		//constructor chaining
		Watch.watchDetails("Iphone",20000);
	}
	
	public static void watchDetails(String name,int price){
		System.out.println("Watch Name is:"+name);
		System.out.println("Watch Price is:"+price);
	}

}