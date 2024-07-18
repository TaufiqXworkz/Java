public class Metro {
    public String name;
    public int lines;
    public int stations;
    public long dailyPassengers;
    public float averageSpeed; // in km/h
    public boolean isOperational;
    public char zone;
    public double ticketPrice;
    public int trains;
    public String director;
    
    // Constructors with different parameter lists
    public Metro(String name) {
        this.name = name;
        System.out.println(name);
    }
    
    public Metro(String name, int lines) {
        this.name = name;
        this.lines = lines;
        System.out.println(name + " " + lines);
    }
    
    public Metro(String name, int lines, int stations) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        System.out.println(name + " " + lines + " " + stations);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed, boolean isOperational) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        this.isOperational = isOperational;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed + " " + isOperational);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed, boolean isOperational, char zone) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        this.isOperational = isOperational;
        this.zone = zone;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed + " " + isOperational + " " + zone);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed, boolean isOperational, char zone, double ticketPrice) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        this.isOperational = isOperational;
        this.zone = zone;
        this.ticketPrice = ticketPrice;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed + " " + isOperational + " " + zone + " " + ticketPrice);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed, boolean isOperational, char zone, double ticketPrice, int trains) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        this.isOperational = isOperational;
        this.zone = zone;
        this.ticketPrice = ticketPrice;
        this.trains = trains;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed + " " + isOperational + " " + zone + " " + ticketPrice + " " + trains);
    }
    
    public Metro(String name, int lines, int stations, long dailyPassengers, float averageSpeed, boolean isOperational, char zone, double ticketPrice, int trains, String director) {
        this.name = name;
        this.lines = lines;
        this.stations = stations;
        this.dailyPassengers = dailyPassengers;
        this.averageSpeed = averageSpeed;
        this.isOperational = isOperational;
        this.zone = zone;
        this.ticketPrice = ticketPrice;
        this.trains = trains;
        this.director = director;
        System.out.println(name + " " + lines + " " + stations + " " + dailyPassengers + " " + averageSpeed + " " + isOperational + " " + zone + " " + ticketPrice + " " + trains + " " + director);
    }
}
