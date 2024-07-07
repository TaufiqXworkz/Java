public class Medical{
	
	public static void medicalDetails(){
		String name = "Shami-medical" ;
		String loca = "HAngal - karnataka ";
		int noOfWorkers = 5;
		
		System.out.println("name is: "+name+" location is: "+loca+"noOfWorkers: "+noOfWorkers);		
		
	}
	
	public static void medicalOwner(String ownerName){
		System.out.println("The Medical Owner name is: "+ownerName);
	}
	
	

	public static boolean medicalVarieties(){
		int tablets = 100; // 100 types of tabs
		int capsules = 80; // 8100 types of capsules
		int liquids = 100; // 100 types of liquids
		int generalItems = 50; // 50 varity of general items
		System.out.println("The types of varieties are availble are");
		System.out.println("Tablets: "+tablets+ " capsules: "+capsules+ " liquids: "+liquids+ " generalItems: "+generalItems);
		return true;
	}
	
	public static int typesOfCustomers(String[] customer){
		
		
		for(int i = 0 ; i<customer.length ; i++){
			System.out.println("the customer is: "+customer[i]);
		}
		return 1;
	}


}