public class Business {

    public static void checkVariables() {
        String businessName = "Tech Solutions";
        int totalEmployees = 250;
        System.out.println("Business Name: " + businessName);
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void displayEmployeeInfo(String employeeName, int employeeAge) {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
    }

    public static String[] getDepartments() {
        String[] departments = {"HR", "Finance", "Development", "Sales"};
		System.out.println("the departments are: ");
		for(int i =0 ; i<departments.length ; i++ ){
			System.out.println("- "+departments[i]);
		}
        return departments;
    }

    public static int[] getEmployeeSalaries(String employeeName) {
        int[] salaries = {50000, 55000, 60000, 65000};
		System.out.println("The Salaries of employess are:");
		for(int i =0 ; i<salaries.length ; i++ ){
			System.out.println("- "+salaries[i]);
		}
        return salaries;
    }
}