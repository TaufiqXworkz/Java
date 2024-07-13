//5. checking Leap Year or Not

public class LeapYearChecking{

	public static void main(String args[]){
		
	int year = 100;
		
	if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ){
		System.out.println("it is Leap Year: "+year);
	}
	else{
		System.out.println("it is not a Leap Year: "+year);
	}
  }
}