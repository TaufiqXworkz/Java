public class Company {
    public String name;
    public int employees;
    public int departments;
    public long annualRevenue;
    public float growthRate;
    public boolean isPublic;
    public char rating;
    public double stockPrice;
    public int offices;
    public String ceo;
    
    // Constructors with different parameter lists
    public Company(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public Company(String name, int employees) {
        this.name = name;
        this.employees = employees;
        System.out.println(name + " " + employees);
    }
    
    public Company(String name, int employees, int departments) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        System.out.println(name + " " + employees + " " + departments);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate, boolean isPublic) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        this.isPublic = isPublic;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate + " " + isPublic);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate, boolean isPublic, char rating) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        this.isPublic = isPublic;
        this.rating = rating;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate + " " + isPublic + " " + rating);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate, boolean isPublic, char rating, double stockPrice) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        this.isPublic = isPublic;
        this.rating = rating;
        this.stockPrice = stockPrice;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate + " " + isPublic + " " + rating + " " + stockPrice);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate, boolean isPublic, char rating, double stockPrice, int offices) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        this.isPublic = isPublic;
        this.rating = rating;
        this.stockPrice = stockPrice;
        this.offices = offices;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate + " " + isPublic + " " + rating + " " + stockPrice + " " + offices);
    }
    
    public Company(String name, int employees, int departments, long annualRevenue, float growthRate, boolean isPublic, char rating, double stockPrice, int offices, String ceo) {
        this.name = name;
        this.employees = employees;
        this.departments = departments;
        this.annualRevenue = annualRevenue;
        this.growthRate = growthRate;
        this.isPublic = isPublic;
        this.rating = rating;
        this.stockPrice = stockPrice;
        this.offices = offices;
        this.ceo = ceo;
        System.out.println(name + " " + employees + " " + departments + " " + annualRevenue + " " + growthRate + " " + isPublic + " " + rating + " " + stockPrice + " " + offices + " " + ceo);
    }
}
