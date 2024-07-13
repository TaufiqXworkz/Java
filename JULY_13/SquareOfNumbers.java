//10 . the Square of the numbers 

public class SquareOfNumbers {
    public static void main(String[] args) {
		
		long num = 12L;
		/*
		long square = num * num;
		
		System.out.println("The Square of "+num+ " is "+square);
		*/
		
		//the square of n natural number is 
		for(int i =1 ; i<=num ; i++  ){
			long square = i * i;
			System.out.println(i +" Square is: "+square);
		}
	}
}