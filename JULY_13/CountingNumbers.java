//4. 50 number checking number count of even or odd

public class CountingNumbers{

	public static void main(String args[]){
		
	int evenCount = 0;
	int oddCount = 0;
		
	for(int num=0 ; num <=50 ; num++){	
		if(num  % 2==0){
			evenCount +=1;
		}else{
			oddCount +=1;	
		}
	}
		System.out.println("Even Number Count is:"+evenCount);
		System.out.println("Odd Number Count is:"+oddCount);
	}
}