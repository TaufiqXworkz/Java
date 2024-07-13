// 7. prime number or not 

public class PrimeNumber{

	public static void main(String args[]){
		
		int num = 30;
		int count= 0;
		if(num<2){
			System.out.println("It is not prime number"+num);
		}
		
		for(int i=2; i<=num; i++){
			if(num % i == 0){
				count++;
			}
		}
		
		if(count<2){
			System.out.println("It is Prime Number:"+num);
		}
		else{
			System.out.println("It is not prime number"+num);
		}
	}
}