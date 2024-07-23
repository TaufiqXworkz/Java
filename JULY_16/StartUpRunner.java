public class StartUpRunner{

	public static void main(String args[]){
		//static varibles initialisation
		StartUp.companyName = " Xworkz";
        StartUp.founderName = "Alice Smith";
        StartUp.coFounderName = "Bob Johnson";
        StartUp.yearFounded = 2020;
        StartUp.numberOfEmployees = 150;
        StartUp.initialFunding = 5.5; 
        StartUp.currentValuation = 50.0; 
        StartUp.industry = "Technology";
        StartUp.headquartersLocation = "BTM";
        StartUp.productType = "Software developement";
        StartUp.isPublic = false;
        StartUp.stockSymbol = "IIT";
        StartUp.website = "www.xworkz.com";
		
		//printling the values of static variables
		System.out.println("Company Name: " + companyName);
        System.out.println("Founder Name: " + founderName);
        System.out.println("Co-Founder Name: " + coFounderName);
        System.out.println("Year Founded: " +yearFounded);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Initial Funding: " + initialFunding + " million");
        System.out.println("Current Valuation: " + currentValuation + " million");
        System.out.println("Industry: " + industry);
        System.out.println("Headquarters Location: " + headquartersLocation);
        System.out.println("Product Type: " + productType);
        System.out.println("Is Public: " + isPublic);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Website: " + StartUp.website);
		
		//obeject 1
		StartUp myStartUp1 = new StartUp();
		myStartUp1.companyName1 = "Tech Innovators";
        myStartUp1.founderName1 = "Job";
        myStartUp1.coFounderName1 = "Akshara";
        myStartUp1.yearFounded1 = 2020;
        myStartUp1.numberOfEmployees1 = 150;
        myStartUp1.initialFunding1 = 5.5; 
        myStartUp1.currentValuation1 = 50.0; 
        myStartUp1.industry1 = "Technology";
        myStartUp1.headquartersLocation1 = "Silicon Valley, CA";
        myStartUp1.productType1 = "Software Solutions";
        myStartUp1.isPublic1 = false;
        myStartUp1.stockSymbol1 = "TII";
        myStartUp1.website1 = "www.techinnovators.com";

        // Print the values of non-static variables
        System.out.println("Company Name: " + myStartUp1.companyName1);
        System.out.println("Founder Name: " + myStartUp1.founderName1);
        System.out.println("Co-Founder Name: " + myStartUp1.coFounderName1);
        System.out.println("Year Founded: " + myStartUp1.yearFounded1);
        System.out.println("Number of Employees: " + myStartUp1.numberOfEmployees1);
        System.out.println("Initial Funding: " + myStartUp1.initialFunding1 );
        System.out.println("Current Valuation: " + myStartUp1.currentValuation1);
        System.out.println("Industry: " + myStartUp1.industry1);
        System.out.println("Headquarters Location: " + myStartUp1.headquartersLocation1);
        System.out.println("Product Type: " + myStartUp1.productType1);
        System.out.println("Is Public: " + myStartUp1.isPublic1);
        System.out.println("Stock Symbol: " + myStartUp1.stockSymbol1);
        System.out.println("Website: " + myStartUp1.website1);
		
	
	}


}