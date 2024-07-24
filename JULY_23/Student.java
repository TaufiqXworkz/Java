public class Student{

	String name;
	double[] grades;
	
	public Student(String name,double[] grades){
		this.name=name;
		this.grades=grades;
	}
	
	public double averageGrade(double[] grades){
		double average=0 ;
		for(int i=0;i<this.grades.length; i++){
			average = average+grades[i];
		}
		average= average/grades.length;
		return average;
	} 
	
	public double highestMarks(double[] grades){
		double max=grades[0];
		for(int i =0 ; i<grades.length ; i++){
			if(grades[i]>max){
				max =grades[i];
			}	
		}
		return max;
	}
	
	public double lowestMarks(double[] grades){
		double min=grades[0];
		for(int i =0 ; i<grades.length ; i++){
			if(grades[i]<min){
				min =grades[i];
			}	
		}
		
		return min;
	}
}