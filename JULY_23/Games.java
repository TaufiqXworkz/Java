public class Games{

	String[] games=new String[4];
	int index=0;
	public int getArrayLength(){
		return games.length;
	}
	
	public void insertArray(String gameName){
		if(this.index<this.getArrayLength()){
			games[index]= gameName;
			index++;
		}else{
			System.out.println("The Array is Full");
		}
	}

	public void readArray(){
		for(int index=0;index<getArrayLength();index++){
			System.out.println("the Array Value:"+games[index]);	
		}
	}
	
	public void searchArray(String gameName){
		System.out.println("The Search Element is:"+gameName);
		for(int index=0; index<getArrayLength();index++){
		if(games[index] == gameName){
			System.out.println("The game found at:"+index);
		 }
	   }
	}
	
	public void deleteArray(String gameName){
		for(int index=0; index<getArrayLength();index++){
			if(games[index] == gameName){
				System.out.println("The deleted game is:"+games[index]);
				games[index] =null;
		 }
	}
 }

}