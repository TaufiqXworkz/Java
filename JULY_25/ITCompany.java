class ITCompany {
 
    String[] employees = new String[4];
    int index = 0;
    
    public int getArrayLength() {
        return employees.length;
    }
    
    public String insertEmployeeName(String employeeName) {
        if (this.index < this.getArrayLength()) {
            employees[index] = employeeName;
            System.out.println(index + ":" + employees[index]);
            index++;
            return "Inserted Successfully";
        }
        return "Not Inserted";
    }
    
    public void readEmployeeNames() {
        for (String name : employees) {
            System.out.println("- " + name);
        }
    }
    
    public String updateEmployeeName(String oldEmployeeName, String newEmployeeName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (employees[i] ==oldEmployeeName) {
                employees[i] = newEmployeeName;
                return "Updated Successfully";
            }
        }
        return "Not Found";
    }
    
    public String deleteEmployeeName(String employeeName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (employees[i] ==employeeName) {
                employees[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Deleted";
    }
    
    public String searchEmployeeName(String employeeName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (employees[i] ==employeeName) {
                return "Search Employee Found: " + employeeName;
            }
        }
        return "Not Found";
    }
}

