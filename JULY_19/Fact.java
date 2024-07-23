/* 1 write a logic to print the factorial of the
each element in the given array.
*/

public class Fact{

	public int factorial(int numbers){
		int fact = 1;
		for(int i = 1; i<=numbers; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	
	public static void main(String args[]){
		
		Fact fc = new Fact();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int num : numbers){
			System.out.println(num +" factorial is = "+ fc.factorial(num));
		}
		
	}
}