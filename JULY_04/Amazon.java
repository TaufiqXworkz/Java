public class Amazon{
	
	public static void primeVideo(){
		boolean isPrimeValide = true;
		if(isPrimeValide){
			System.out.println("Your prime is valide");
		}else{
			System.out.println("Your prime is Expired");
		}
	}
	
	public static void primeMusic(String songName){
		boolean isSongAvailable =true;
		if(isSongAvailable){
			System.out.println("Your song is: "+songName+" is playing");
		}else{
			System.out.println("This song is not available");
		}
	}

	public static boolean amazonPay(){
		int balance =1000;
		if(balance>=500){
			System.out.println("You can shop now");
		}else{
			System.out.println("Your Balance is low");
		}
		return true;
	}
	
	public static int primeShopping(String[] itemNames, int itemPrice){
			System.out.println("You are shopped items are");
		for(int i= 0 ; i<itemNames.length ; i++){
			System.out.println("-" +itemNames[i]);			
		}
		if(itemPrice>=5000){
			System.out.println("Heavy shopping");
		}else{
			System.out.println("You perchased something");
		}
		
		return 1;
	}


}