public class Weekend{

	public static void main(String args[]){
		
		String days[]= {"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
		
		for(int i =0; i<days.length; i++){
			
			if(days[i]== "Sunday" ||  days[i]=="Saturday"){
				System.out.println( "The day is weekend "+days[i]);
			}else{
				System.out.println("Not a weekend day "+days[i]);
			}
		}
	}

}