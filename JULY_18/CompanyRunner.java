public class CompanyRunner {
    public static void main(String[] args) {
        // Creating instances of Company with different constructors
        Company cmp1 = new Company("TechCorp");
        Company cmp2 = new Company("TechCorp", 500);
        Company cmp3 = new Company("TechCorp", 500, 10);
        Company cmp4 = new Company("TechCorp", 500, 10, 200000000L);
        Company cmp5 = new Company("TechCorp", 500, 10, 200000000L, 12.5f);
        Company cmp6 = new Company("TechCorp", 500, 10, 200000000L, 12.5f, true);
        Company cmp7 = new Company("TechCorp", 500, 10, 200000000L, 12.5f, true, 'A');
        Company cmp8 = new Company("TechCorp", 500, 10, 200000000L, 12.5f, true, 'A', 150.75);
        Company cmp9 = new Company("TechCorp", 500, 10, 200000000L, 12.5f, true, 'A', 150.75, 20);
        Company cmp10 = new Company("TechCorp", 500, 10, 200000000L, 12.5f, true, 'A', 150.75, 20, "Jane Doe");
    }
}
