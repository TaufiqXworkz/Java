public class CountNum{
	public static void main(String args[]){
	
	int arr[] = {1,-1,2,3,4,-4,-5,-6,8};
	int positiveCount=0;
	int negativeCount=0;
	
	for(int i =0; i<arr.length; i++){
	
		if(arr[i]>0){
			positiveCount+=1;
		}else{
			negativeCount+=1;
		}
	}	
	System.out.println("positiveCount: "+positiveCount);
	System.out.println("negativeCount: "+negativeCount);
	
}

}