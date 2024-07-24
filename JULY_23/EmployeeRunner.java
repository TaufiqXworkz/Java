public class EmployeeRunner{
	public static void main(String args[]){
		
		double[] salaries={10000,20000,30000,40000,50000,6000};
		Employee emp= new Employee("TAUFIQ",salaries);
		
		double total=emp.totalAnnualSalary(salaries);
		System.out.println("Total Annual Salary:"+total);
		
		double avg= emp.averageIncome(salaries);
		System.out.println("The average Salary is:"+avg);
		
		double highest=emp.highestMonthSalary(salaries);
		System.out.println("The highest salary of the month is:"+highest);
		
		double lowest=emp.lowestMonthSalary(salaries);
		System.out.println("The lowest salary of the month is:"+lowest);
	}
}