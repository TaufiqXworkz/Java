class MedicalStoreRunner {
    public static void main(String args[]) {
        MedicalStore medicalStore = new MedicalStore();
        int length = medicalStore.getArrayLength();
        System.out.println("========Creation=======");
        System.out.println("The Array is created of length: " + length);
        
        System.out.println("========Insertion=======");
        medicalStore.insertMedicineName("Paracetamol");
        medicalStore.insertMedicineName("Ibuprofen");
        medicalStore.insertMedicineName("Amoxicillin");
        medicalStore.insertMedicineName("Cough Syrup");
        
        System.out.println("========Reading=======");
        medicalStore.readMedicineNames();
        
        System.out.println("========Updating=======");
        medicalStore.updateMedicineName("Amoxicillin", "Antibiotic");
        medicalStore.readMedicineNames();
        
        System.out.println("========Deleting=======");
        medicalStore.deleteMedicineName("Antibiotic");
        medicalStore.readMedicineNames();
        
        System.out.println("========Searching=======");
        String search = medicalStore.searchMedicineName("Ibuprofen");
        System.out.println("Result: " + search);
    }
}