class GameRunner{
	public static void main(String args[]){

	Game game = new Game();
	int length=game.getArrayLength();
	System.out.println("========Creation=======");
	System.out.println("The Array is created of length:"+length);
	
	System.out.println("========Insertion=======");
	game.insertGameNames("SubWay Surf");
	game.insertGameNames("Free Fire");
	game.insertGameNames("Pubg");
	game.insertGameNames("Among US");
	
	System.out.println("========Reading=======");
	game.readGameNames();
	
	System.out.println("========Updating=======");
	game.updateGameName("Pubg","COD");
	game.readGameNames();
	
	System.out.println("========Deleting=======");
	game.deleteGameName("COD");
	game.readGameNames();
	
	System.out.println("========Searching=======");
	String search =game.searchGameName("Free Fire");
	System.out.println("Result:"+search);
}
}