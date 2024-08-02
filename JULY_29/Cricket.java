/*4. Create a class with 3 properties and declare a 4 ways of
methods and achieve method overloading and chaining of instance methods
*/

public class Cricket {
    private String playerName;
    private int playerAge;
    private double battingAverage;

    // Constructor
    public Cricket(String playerName, int playerAge, double battingAverage) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.battingAverage = battingAverage;
    }
	
	//1 way of method
	public void printDetail(){
		System.out.println("Player Name:"+this.playerName);
		System.out.println("Player Age:"+this.playerAge);
		System.out.println("Player Average:"+this.battingAverage);
	}

	public double battingAverage(){
		return this.battingAverage;
	}
	
	public void playerName(String name){
		System.out.println("Player Name:"+name);
	}
	
	public int playerNameAge(String name){
		this.playerName=name;
		System.out.println("Player Name:"+name);
		return this.playerAge;
	}

    

   
}
