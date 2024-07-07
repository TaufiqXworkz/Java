public class Bekary{
	
	public static void bakeryDetail(){
		String name = "Golden Bakery";
		int noOFEmployee = 10;
		String location = "BTMLayout";
		System.out.println("Name of the Bakery: "+name );		
		
	}
	
	public static void bakeryOwner(String ownerName){
		System.out.println("The Owner name is: "+ownerName);
	}
	
	

	public static boolean revenueOFtheDay(){
		float day1 = 10000.0f;
		float day2 = 9000.0f;
		float day3 = 6000.0f;
		float day4 = 10000.0f;
		float day5 = 12000.0f;
		float day6 = 15000.0f;
		float totalDaysRevenue = day1+ day2 + day3 + day4 + day5 + day6;
		System.out.println("The total revenue of the week: "+totalDaysRevenue);	
		return true;
	}
	
	
	public static int bakeryItem(String[] items){
		boolean isitemsAvailable= true;
	    System.out.println("Special items are");
		for(int i= 0 ; i<items.length ; i++){
			System.out.println("-" +items[i]);			
		}
		return 1;
	}


}