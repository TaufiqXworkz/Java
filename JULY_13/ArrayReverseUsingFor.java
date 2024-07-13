// 13. reversing the array element using For

public class ArrayReverseUsingFor {
	
	public static int inverse(int num){
		int reversedNumber =0;
		for(; num !=0; num= num/10){
			int reminder = num% 10; 
            reversedNumber = reversedNumber * 10 + reminder;	
		}
		return reversedNumber;
		
	}
	
	
    public static void main(String[] args) {
        int numbers[] = {123,456,789,245};
        
		for(int i =0 ; i<numbers.length ; i++){
			numbers[i]= ArrayReverseUsingFor.inverse(numbers[i]);
			System.out.print(numbers[i] + " ");
		}  
    }
}