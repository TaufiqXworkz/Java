public class StudentRunner{
	public static void main(String args[]){
		
		double[] grades={10,20,30,40,50,60};
		Student st= new Student("TAUFIQ",grades);
		
		double avg= st.averageGrade(grades);
		System.out.println("The average marks is:"+avg);
		
		double highest=st.highestMarks(grades);
		System.out.println("the highest mark is:"+highest);
		
		double lowest=st.lowestMarks(grades);
		System.out.println("The lowest mark is:"+lowest);
	}
}