// 12. reversing the array element

public class ArrayReverse {
	
	public static int inverse(int num){
		int reversedNumber =0;
		while(num !=0){
			int reminder = num% 10; 
            reversedNumber = reversedNumber * 10 + reminder;
			num= num/10;	
		}
		return reversedNumber;
		
	}
	
	
    public static void main(String[] args) {
        int numbers[] = {123,456,789,245};
        
		for(int i =0 ; i<numbers.length ; i++){
			numbers[i]= ArrayReverse.inverse(numbers[i]);
			System.out.print(numbers[i] + " ");
		}  
    }
}