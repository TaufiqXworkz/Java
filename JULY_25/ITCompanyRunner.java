class ITCompanyRunner {
    public static void main(String args[]) {
        ITCompany itCompany = new ITCompany();
        int length = itCompany.getArrayLength();
        System.out.println("========Creation=======");
        System.out.println("The Array is created of length: " + length);
        
        System.out.println("========Insertion=======");
        itCompany.insertEmployeeName("Taufiq Raza");
        itCompany.insertEmployeeName("Gulam");
        itCompany.insertEmployeeName("Md Saad");
        itCompany.insertEmployeeName("Jhenkar");
        
        System.out.println("========Reading=======");
        itCompany.readEmployeeNames();
        
        System.out.println("========Updating=======");
        itCompany.updateEmployeeName("Gulam", "Gulam Jeelani");
        itCompany.readEmployeeNames();
        
        System.out.println("========Deleting=======");
        itCompany.deleteEmployeeName("Taufiq Raza");
        itCompany.readEmployeeNames();
        
        System.out.println("========Searching=======");
        String search = itCompany.searchEmployeeName("Jhenkar");
        System.out.println("Result: " + search);
    }
}
