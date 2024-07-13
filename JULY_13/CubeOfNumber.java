//11 . the Cube of the numbers 

public class CubeOfNumber {
    public static void main(String[] args) {
		
		long num = 12L;
		
		//the Cube of n natural number is 
		for(int i =1 ; i<=num ; i++  ){
			long cube = i * i * i;
			System.out.println(i +" Square is: "+cube);
		}
	}
}