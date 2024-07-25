class MedicalStore {
 
    String[] medicines = new String[4];
    int index = 0;
    
    public int getArrayLength() {
        return medicines.length;
    }
    
    public String insertMedicineName(String medicineName) {
        if (this.index < this.getArrayLength()) {
            medicines[index] = medicineName;
            System.out.println(index + ":" + medicines[index]);
            index++;
            return "Inserted Successfully";
        }
        return "Not Inserted";
    }
    
    public void readMedicineNames() {
        for (String name : medicines) {
            System.out.println("- " + name);
        }
    }
    
    public String updateMedicineName(String oldMedicineName, String newMedicineName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (medicines[i] == oldMedicineName) {
                medicines[i] = newMedicineName;
                return "Updated Successfully";
            }
        }
        return "Not Found";
    }
    
    public String deleteMedicineName(String medicineName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (medicines[i] == medicineName) {
                medicines[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Deleted";
    }
    
    public String searchMedicineName(String medicineName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (medicines[i] ==medicineName) {
                return "Search Medicine Found: " + medicineName;
            }
        }
        return "Not Found";
    }
}


