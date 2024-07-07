public class CompanyRunner{

	public static void main(String args[]){
	
		Company.checkNumberOfEmployees();
		Company.companyName("TATA");
		Company.companyDetails();
		String[] projects ={"EV","ROBOTS","AI","CHATGPT"};
		Company.companyProjects(projects);
	
	}

}