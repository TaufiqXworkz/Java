public class GameRunner{
	
	public static void main(String args[]){
		Games game = new Games();
		int length= game.getArrayLength();
		System.out.println("Array length:"+length);
		
		game.insertArray("SubWay Surf");
		game.insertArray("Temple runner");
		game.insertArray("Free Fire");
		game.insertArray("Pubg");
		game.insertArray("COD");
		
		game.readArray();
		
		game.searchArray("Free Fire");
		
		game.deleteArray("Pubg");
		
		
	}
}