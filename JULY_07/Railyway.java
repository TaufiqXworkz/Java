public class Railyway{
	
	public static void railywayDetail(){
		String name = "Vande Bharat";
		int noOFCompartments = 15;
		String depart = "Bengaluru";
		String arrival = "Mumbai";
		System.out.println("Name: "+name+" noOFCompartments:"+noOFCompartments+" depart from: "+depart+ " arrival at: "+arrival);		
		
	}
	
	public static void bakeryMinister(String ministerName){
		System.out.println("The minister name is: "+ministerName);
	}
	

	public static boolean typesOfTrainPrice(){
		String trainName[] ={"local","sleeper","semi_sl","AC","two_tier"};
		double cost[] = {150.0,400.0,600,1000,1200};
		
		for(int i = 0 ; i<trainName.length ; i++){
			System.out.println("the train is: "+trainName[i] + " & the cost is: "+cost[i]);
		}
			
		return true;
	}
	
	
	public static int trainTypes(String[] names){
		boolean isTrainAvailable= true;
	    System.out.println("Special trains  are");
		for(int i= 0 ; i<names.length ; i++){
			System.out.println("-" +names[i]);			
		}
		return 1;
	}


}