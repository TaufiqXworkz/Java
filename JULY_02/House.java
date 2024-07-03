public class House {
    
    public static void displayFamilyDetails(String[] familyMembers) {
        System.out.println("Family Details:");
        for (int i=0; i<familyMembers.length; i++) {
            System.out.println("- " + familyMembers[i]);
        }
    }
}
