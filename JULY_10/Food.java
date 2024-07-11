/* 1.class Food, in that write a method, which has to accept the FoodItemName and 
Quantity display 20 foodItemName with 
quantity and Price(price can taken has local variable)
Ex: quantity is 2
price is 10
total price is: 20
need to print for all 20 FoodItems
*/

public class Food{

	public static void foodChecking(){
		
		String[] foodItems ={"Dosa", "Idli", "Maggi","Biscuit", 
		"panipuri","Gobi", "EggPups", "Chicken", "FiredRice","Momos", "EggRice", 
		"bread", "noddles", "Prown", "Fish", "vegRice","Biryani", "Parota", "Tali", "Pao"}; 
		
		int[] foodItemQuatity={2,5,6,7,8,10,11,24,3,4,6,9,2,4,6,14,11,12,14,10}; //quatity
		
		int[] foodPrice={40,50,30,10,30,30,10,40,50,30,10,10,35,50,50,60,20,100,40,70}; // in rupees
		
		for(int i=0; i<foodItems.length ; i++){
			
			System.out.println("FoodItem is:"+foodItems[i]);
			System.out.println("Quatity is:"+foodItemQuatity[i]);
			System.out.println("Price is:"+foodPrice[i]);
			
			int sum = foodItemQuatity[i] * foodPrice[i];
			System.out.println("Total Price is:"+sum);
			
			System.out.println();
			
		}
		
	}

	public static void main(String args[]){
		
		Food.foodChecking();
		
		
	}

}