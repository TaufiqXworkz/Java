public class OverLoadingFunctionsRunner{

	public static void main(String args[]){
		
		OverLoadingFunctions.laptop();
		OverLoadingFunctions.laptop('A');
		OverLoadingFunctions.laptop('A',58000);		
		OverLoadingFunctions.laptop('A',58000,7f);
		OverLoadingFunctions.laptop('A',58000,7f,true);
		OverLoadingFunctions.laptop('A',58000,7f,true,5);
		
		OverLoadingFunctions.laptop('A',58000,7f,true,5,2);
		OverLoadingFunctions.laptop('A',58000,7f,true,5,1,2);
		OverLoadingFunctions.laptop('A',58000,7f,true,5,1,2,10000);
		
		OverLoadingFunctions.mobile("IPhone");
		OverLoadingFunctions.mobile("IPhone", 10000);
		
	}

}