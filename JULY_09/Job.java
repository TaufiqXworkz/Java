public class Job {

	public static void getJob(){
		System.out.println("I got a job");
		Job.setJob();
	}
	
	public static void setJob(){
		System.out.println("Improve your Skills");
		Job.getJob();
	}

}