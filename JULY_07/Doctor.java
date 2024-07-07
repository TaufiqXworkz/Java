public class Doctor {
    public static void initializeVariables() {
        String hospitalName = "City Hospital";
        int totalDoctors = 75;
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Total Doctors: " + totalDoctors);
    }

    public static void displayDoctorInfo(String doctorName, int doctorExperience) {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Doctor Experience: " + doctorExperience + " years");
    }

    public static String[] getSpecializations() {
        String[] specializations = {"Cardiology", "Neurology", "Pediatrics", "Orthopedics"};
		System.out.println("the Specializations are: ");
		for(int i =0 ; i<specializations.length ; i++ ){
			System.out.println("- "+specializations[i]);
		}
        return specializations;
    }

    public static int[] getPatientCounts(String doctorName) {
        int[] patientCounts = {30, 25, 40, 20};
		System.out.println("the Patient Counts are: ");
		for(int i =0 ; i<patientCounts.length ; i++ ){
			System.out.println("- "+patientCounts[i]);
		}
        return patientCounts;
    }
}

