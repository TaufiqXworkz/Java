public class EncapsulationRunner{

	public static void main(String args[]){
		
		Encapsulation profile = new Encapsulation();
		
		profile.setName("Taufiq Raza Sirbadgi");
		System.out.println("Name:"+profile.getName());
		
		profile.setAge(23);
		System.out.println("Age:"+profile.getAge());
		
		profile.setQualification("Computer Science");
		System.out.println("Qualification:"+profile.getQualification());
		
		profile.setCgpa(8.2f);
		System.out.println("CGPA:"+profile.getCgpa());
		
		profile.setPercentage(80.0);
		System.out.println("Percentage:"+profile.getPercentage());
		
		profile.setGrade('A');
		System.out.println("Grade:"+profile.getGrade());
		
		profile.setExperience(2);
		System.out.println("Experience:"+profile.getExperience());
		
		profile.setAddress("Vijay Nagar Hangal");
		System.out.println("Address:"+profile.getAddress());
		
		profile.setHobby("Coding");
		System.out.println("Hobby:"+profile.getHobby());
		
		
		String skills[]= {"Java","MySql","JDBC"};
		profile.setSkills(skills);
		for(String name:skills){
		profile.getSkills();
		System.out.println("-"+name);
		}
	
	}




}