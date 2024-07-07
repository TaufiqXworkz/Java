public class ReligionRunner {
    public static void main(String[] args) {
        Religion.initializeVariables();
        Religion.displayReligionInfo("Hinduism", 1000000000);
		System.out.println("Holy Books:");
        Religion.getHolyBooks();
		System.out.println("Major Festivals:");
        Religion.getMajorFestivals("Hinduism");
        
    }
}