public class SortArray{

	public static void main(String args[]){
		
		int arr[] ={5,4,2,7,8,6,3,2,1,9};
		for(int i =0 ; i<arr.length ; i++){
			for(int j =i+1 ; j<arr.length-1 ; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k = arr.length-1 ; k>=0; k--){
			System.out.print(" " +arr[k]);
		}
	}
}