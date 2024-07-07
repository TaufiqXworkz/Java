public class Hospital{
	
	public static void hospitalDetails(){
		String name = "Jayadeva" ;
		String loca = "jp nagar near gopalan mall";
		int noOfWorkers = 100;
		
		System.out.println("name is: "+name+" location is: "+loca+"noOfWorkers: "+noOfWorkers);		
		
	}
	
	public static void hospitalOwner(String ownerName){
		System.out.println("The Medical Owner name is: "+ownerName);
	}
	
	

	public static boolean hospitalVarieties(){
		int BP = 100; // 100 BP machine available
		int HeartBeat = 80; // 80 machine available
		int waterLevel = 12; // 100 machine available
		int labs = 50; // 50 varity operation labs
		System.out.println("The types of varieties are availble are");
		System.out.println("BP: "+BP+ " HeartBeat: "+HeartBeat+ " waterLevel: "+waterLevel+ " labs: "+labs);
		return true;
	}
	
	public static int typesOfCustomers(String[] customer){
		
		
		for(int i = 0 ; i<customer.length ; i++){
			System.out.println("the customer is: "+customer[i]);
		}
		return 1;
	}


}