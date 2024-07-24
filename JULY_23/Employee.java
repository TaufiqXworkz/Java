public class Employee{

	String name;
	double[] salaries;
	
	public Employee(String name,double[] salaries){
		this.name=name;
		this.salaries=salaries;
	}
	
	public double totalAnnualSalary(double[] salaries){
		double annualIncome=0;
		for(int i=0;i<this.salaries.length; i++){
			annualIncome = annualIncome+salaries[i];
		}
		return annualIncome;
	} 
	
	public double averageIncome(double[] salaries){
		double average=0 ;
		for(int i=0;i<this.salaries.length; i++){
			average = average+salaries[i];
		}
		average= average/salaries.length;
		return average;
	} 
	
	public double highestMonthSalary(double[] salaries){
		double high=salaries[0];
		for(int i =0 ; i<salaries.length ; i++){
			if(salaries[i]>high){
				high =salaries[i];
			}	
		}
		return high;
	}
	
	public double lowestMonthSalary(double[] salaries){
		double low=salaries[0];
		for(int i =0 ; i<salaries.length ; i++){
			if(salaries[i]<low){
				low =salaries[i];
			}	
		}
		
		return low;
	}
}