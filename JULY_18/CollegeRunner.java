public class CollegeRunner {
    public static void main(String[] args) {
        College cl1 = new College("AGDI College");
        College cl2 = new College("AGDI College", 10);
        College cl3 = new College("AGDI College", 10, 100);
        College cl4 = new College("AGDI College", 10, 100, 5000L);
        College cl5 = new College("AGDI College", 10, 100, 5000L, 4.5f);
        College cl6 = new College("AGDI College", 10, 100, 5000L, 4.5f, true);
        College cl7 = new College("AGDI College", 10, 100, 5000L, 4.5f, true, 'A');
        College cl8 = new College("AGDI College", 10, 100, 5000L, 4.5f, true, 'A', 5000000);
        College cl9 = new College("AGDI College", 10, 100, 5000L, 4.5f, true, 'A', 5000000, 15);
        College cl10 = new College("AGDI College", 10, 100, 5000L, 4.5f, true, 'A', 5000000, 15, "Dr. Smith");
    }
}
