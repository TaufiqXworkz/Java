/* 3. write a program to count the number of occurrences of the
char in the given array
*/

public class CharOccurance{

	public int count(char[] words){
		int occurance=0;
		for(int  i=0;  i<words.length; i++){
			for(int j =0 ; j<words.length-i-1; j++){
			if(words[j] == words[j+1]){
				occurance++;
			}
		}
	}
		return occurance;
}
	
	public static void main(String args[]){
		
		CharOccurance co = new CharOccurance();
		char[] words = {'A','B','C','D','A','C', 'D','B','C','A'};
		
		for(char word : words){
			System.out.println(word + " : the number of occurance is = "+co.count(word));
		}
		
	}

}