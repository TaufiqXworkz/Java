public class University {
    public String name;
    public int departments;
    public int faculty;
    public long students;
    public float rating; // overall rating
    public boolean isReputed;
    public char grade;
    public double annualBudget;
    public int universityBuses;
    public String chancellor;
    
    // Constructors with different parameter lists
    public University(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public University(String name, int departments) {
        this.name = name;
        this.departments = departments;
        System.out.println(name + " " + departments);
    }
    
    public University(String name, int departments, int faculty) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        System.out.println(name + " " + departments + " " + faculty);
    }
    
    public University(String name, int departments, int faculty, long students) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        System.out.println(name + " " + departments + " " + faculty + " " + students);
    }
    
    public University(String name, int departments, int faculty, long students, float rating) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating);
    }
    
    public University(String name, int departments, int faculty, long students, float rating, boolean isReputed) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed);
    }
    
    public University(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade);
    }
    
    public University(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget) {
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
    
    public University(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget, int universityBuses) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        this.annualBudget = annualBudget;
        this.universityBuses = universityBuses;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade + " " + annualBudget + " " + universityBuses);
    }
    
    public University(String name, int departments, int faculty, long students, float rating, boolean isReputed, char grade, double annualBudget, int universityBuses, String chancellor) {
        this.name = name;
        this.departments = departments;
        this.faculty = faculty;
        this.students = students;
        this.rating = rating;
        this.isReputed = isReputed;
        this.grade = grade;
        this.annualBudget = annualBudget;
        this.universityBuses = universityBuses;
        this.chancellor = chancellor;
        System.out.println(name + " " + departments + " " + faculty + " " + students + " " + rating + " " + isReputed + " " + grade + " " + annualBudget + " " + universityBuses + " " + chancellor);
    }
}
