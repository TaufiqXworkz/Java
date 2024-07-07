public class DoctorRunner {
    public static void main(String[] args) {
        Doctor.initializeVariables();
        Doctor.displayDoctorInfo("Dr.Ravi kumar", 10);
        Doctor.getSpecializations();
		Doctor.getPatientCounts("Dr. Sarah Johnson");
        
    }
}