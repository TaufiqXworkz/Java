public class UniversityRunner {
    public static void main(String[] args) {
        // Creating instances of University with different constructors
        University un1 = new University("VTU University");
        University un2 = new University("VTU University", 10);
        University un3 = new University("VTU University", 10, 200);
        University un4 = new University("VTU University", 10, 200, 15000L);
        University un5 = new University("VTU University", 10, 200, 15000L, 4.7f);
        University un6 = new University("VTU University", 10, 200, 15000L, 4.7f, true);
        University un7 = new University("VTU University", 10, 200, 15000L, 4.7f, true, 'A');
        University un8 = new University("VTU University", 10, 200, 15000L, 4.7f, true, 'A', 5000000);
        University un9 = new University("VTU University", 10, 200, 15000L, 4.7f, true, 'A', 5000000, 20);
        University un10 = new University("VTU University", 10, 200, 15000L, 4.7f, true, 'A', 5000000, 20, "Dr. Williams");
    }
}
