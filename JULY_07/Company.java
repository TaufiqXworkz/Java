public class Company{
	
	public static void checkNumberOfEmployees(){
		int maleEmployees = 500;
		int femaleEmployees= 400;
		int totalEmployees = maleEmployees+femaleEmployees;
		
		System.out.println("The Comapny Employees are: "+totalEmployees );		
		
	}
	
	public static void companyName(String companyName){
		System.out.println("The Comapny name is: "+companyName);
	}
	
	

	public static boolean companyDetails(){
		String owner = "TAUFIQ_RAZA";
		return true;
	}
	
	public static int companyProjects(String[] projects){
		boolean isProjectsAvailable= true;
	    System.out.println("Special Projects are");
		for(int i= 0 ; i<projects.length ; i++){
			System.out.println("-" +projects[i]);			
		}
		return 1;
	}


}