/* 2. Write a class to achieve method chaining
class Name: LinkDind
methods: need to write a 5 methods, to display the profile details,if user invoke the
details then developer needs to display Profile details, Education details, Personal details,
here profileDetails(), eductaionDetails(), personalDetails(), skills(), percentageOfDegree()
*/
public class LinkDin{

	public static void profileDetails(){
		System.out.println("The Profile Details:");

		String name = "TAUFIQ-RAZA";
		System.out.println("Name: "+name);
		
		String gmail = "mrtaufiq@gmail.com";
		System.out.println("gmail: "+gmail);

		long PhoneNumber = 7676356614L;
		System.out.println("PhoneNumber: "+PhoneNumber);

		String linkDinId = "http://taufiq-raza";
		System.out.println("linkDinId: "+linkDinId);
		
		//invoking the other methods to get method chaining
			LinkDin.eductaionDetails();
			LinkDin.personalDetails();
			LinkDin.skills();
			LinkDin.percentageOfDegree();
			
			System.out.println();
		
	}
	
	public static void eductaionDetails(){
		System.out.println("The Education Details:");
		
		String schoolName = "H M U H School";
		float  schoolPer = 89f;
		System.out.println("schoolName: "+schoolName+ "& schoolPer: "+schoolPer);

		
		String puc = "Govt College";
		float pucPer = 78f;
		System.out.println("puc: "+puc+ "& pucPer: "+pucPer);
	
		String degree = "Computer Science Engineer";
		String collegeName = "SKSVMACET";
		int passOutYear = 2024;
		System.out.println("degree: "+degree+ "& collegeName: "+collegeName+ "pass out: "+passOutYear);
		System.out.println();

	}
	
	public static void personalDetails(){
		System.out.println("The Personal details are:");
		
		String fullName = "TAUFIQ RAZA SIRBADGI";
		System.out.println("fullName: "+fullName);

		int age = 22;
		System.out.println("age: "+age);

		String education = "BE CS Gratuated";
		System.out.println("education: "+education);

		String fatherName = "Md. Mateen";
		System.out.println("fatherName: "+fatherName);

		String address = "VIJAY NAGAR HANGAL- HAVERI DIST - 581104";
		System.out.println("address: "+address);
				System.out.println();


	}
	
	
	public static void skills(){
		System.out.println("The good Technical Skills i have");

		
		String programmingLangauge = "JAVA";
		System.out.println("programmingLangauge: "+programmingLangauge);

		String backEnd = "SQL";
		System.out.println("backEnd: "+backEnd);

		String frontEnd = "HTML AND CSS";
		System.out.println("frontEnd: "+frontEnd);

		String personalSkill = "Problem Solving and LeaderShip";
		System.out.println("personalSkill: "+personalSkill);
				System.out.println();


	}
	
	public static void percentageOfDegree(){
		System.out.println("The percentage of Degree College is");
		double percentage = 82;
		System.out.println("percentage: "+percentage);
				System.out.println();


	}
	
	//main method
	public static void main(String args[]){
		
		LinkDin.profileDetails();
		
		
	}
	
	
	

}