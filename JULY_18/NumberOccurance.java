/* 2. write a program to count the number of occurrences of the
numbers in the given array
*/

public class NumberOccurance{

	public int count(int[] num, int target){
		int occurance=0;
		for(int  i=0;  i<num.length; i++){
			if(num[i] == target){
				occurance++;
			}
		}
		return occurance;
	}
	
	public static void main(String args[]){
		
		NumberOccurance no = new NumberOccurance();
		int[] num = {1,2,3,1,4,5,1,7,8,1,1,5};
		//int target = 1;
		System.out.println(no.count(num,1));
	}

}