public class CricketRunner{

	 public static void main(String[] args) {
        Cricket player = new Cricket("Virat Kohli", 34, 50.5);

       player.printDetail();
	   
	   double average=player.battingAverage();
	   System.out.println("average:"+average);
	   
	   player.playerName("TAUFIQ");
	   
	   int age=player.playerNameAge("ABD");
	   System.out.println(age);
    }

}