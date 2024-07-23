/* 2. Create a simple JobApplication(class)
1. class should contains constructor(no-argument constructor, all argument constructor)
2. declare a 8 properties
1. write a method to check if age is < 18 then display not eligible for Job
2. Write a method to check if age >21 and Qualification is 'BE' then display they are eligible for applying Software jobs
3. write a method, if qualification and Skills are matching then they are eligible to apply Java developer
(note: here Skills should taken as array).
4. Write a method to calculate the % of the student (SSLC)
5. if Degree % >5.0 and qualification is BE, then they are eligible to apply for Software developer
(print the respective message in each method, make sure that all 4 ways should be used for method declaration)
*/

public class JobApplication{
	
	String developerName;
	String jobDescription;
	int developerAge;
	String qualification;
	boolean isJobAvailable;
	int sslcPercentage;
	double degreePercentage;
	String[] skills;
	
	public JobApplication(){
		System.out.println("Job Application is Open");
	}
	
	public JobApplication(String developerName,String jobDescription,int developerAge,String qualification,
	boolean isJobAvailable,int sslcPercentage,double degreePercentage,String[] skills){
		
		this.developerName=developerName;
		this.jobDescription=jobDescription;
		this.developerAge=developerAge;
		this.qualification=qualification;
		this.isJobAvailable=isJobAvailable;
		this.sslcPercentage=sslcPercentage;
		this.degreePercentage=degreePercentage;
		this.skills=skills;
	}
	
	public void jobCriteria1(){
		int developerAge= 23;
		if(developerAge<18){
			System.out.println("Not eligible for Job");
		}else{
			System.out.println("Eligible for Job");
		}
	}
	
	public void jobCriteria2(int developerAge,String qualification){
		if(developerAge>21 && qualification=="B.E"){
			System.out.println("Eligible for applying Software jobs");
		}else{
			System.out.println("Not Eligible for Job");
		}
	}
	
	public boolean jobCriteria3(String qualification){
		String[] skills={" ","Java","MySql"};
		if(qualification=="B.E" && skills[1]=="Java" && skills[2]=="MySql"){
			System.out.println("Eligible for Job");
		}else{
			System.out.println("Not Eligible for Job");
		}
		return true;
	}
	
	public void jobCriteria4(double degreePercentage,String qualification){
		if(qualification=="B.E" && degreePercentage>70){
			System.out.println("Eligible for Job");
		}else{
			System.out.println("Not Eligible for Job");
		}
		
	}
	
	public int percentageCount(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6){
		int sslcPercentage = (sub1+sub2+sub3+sub4+sub5+sub6)/6;
		System.out.println("The percentage of sslc is:"+sslcPercentage);
		return sslcPercentage;
	}
	
	public static void main(String args[]){
		
		JobApplication job1= new JobApplication();
		
		String[] skills={"Java","MySql","Html","Css","javaScript"};
		JobApplication job2= new JobApplication("TAUFIQ","JAVA-Developer",23,"B.E",true,89,82,skills);
		
		JobApplication job3= new JobApplication();
		job3.jobCriteria1();
		job3.jobCriteria2(23,"B.E");
		job3.jobCriteria3("B.E");
		job3.jobCriteria4(82,"B.E");
		job3.percentageCount(85,56,98,75,65,74);
		
		
	}
	
	
}