//8 . reverse a number without for loop

public class ReverseNumber{

	public static void main(String args[]){
		
		long number = 9876543210L;
		long reverse=0L;
		/* 
		while(number>0){
			int rem = number% 10;
			reverse = reverse * 10 + rem;
			System.out.println("reverse: "+reverse+ " rem: "+rem);
			number = number /10;
		}
		*/
		for(int i=0; i<=number ; i++){
			long rem = number% 10;
			reverse = reverse * 10 + rem;
			//System.out.println("reverse: "+reverse+ " rem: "+rem);
			number = number /10;
		}
		System.out.println("reverse: "+reverse);

	}
}