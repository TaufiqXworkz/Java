public class College {
    public String name;
    public int departments;
    public int faculty;
    public long students;
    public float rating; // overall rating
    public boolean isReputed;
    public char grade;
    public double annualBudget;
    public int collegeBuses;
    public String principal;
    
    // Constructors with different parameter lists
    public College(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public College(String name, int departments) {
        this.name = name;
        this.departments = departments;
        System.out.println(name + " " + departments);
    }
    
    public College(String name, int departments, int faculty) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        System.out.println(name + " " + departments + " " + faculty);
    }
    
    public College(String name, int departments, int faculty, long students) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        System.out.println(name + " " + departments + " " + faculty + " " + students);
    }
    
    public College(String name, int departments, int faculty, long students, float rating) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating);
    }
    
    public College(String name, int departments, int faculty, long students, float rating, boolean isReputed) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed);
    }
    
    public College(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade);
    }
    
    public College(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        this.annualBudget = annualBudget;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade + " " + annualBudget);
    }
    
    public College(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget, int collegeBuses) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        this.annualBudget = annualBudget;
        this.collegeBuses = collegeBuses;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade + " " + annualBudget + " " + collegeBuses);
    }
    
    public College(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget, int collegeBuses, String principal) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        this.annualBudget = annualBudget;
        this.collegeBuses = collegeBuses;
        this.principal = principal;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade + " " + annualBudget + " " + collegeBuses + " " + principal);
    }
}
