/*4. declare a class to achieve instance method overloading and chaining. */

public class Shoes{
	
	public void shoesDetails(){
		System.out.println("Shoes Details");
	}
	
	public void shoesDetails(String name,long price){
		System.out.println("Shoes Name is:"+name);
		System.out.println("Shoes Price is:"+price);
		this.shoesDetails();
	}

}