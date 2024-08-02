public class BagRunner{

	public static void main(String args[]){
		Bag bagdetails = new Bag("Lenovo",1200,"Black",true);
		
		System.out.println("the bagCompanyName is " +bagdetails.bagCompanyName);
		
		System.out.println("the bagPrice is "+bagdetails.bagPrice);
		
		System.out.println("the bag color is " +bagdetails.bagColor);
		
		System.out.println("the quality of is " +bagdetails.isBagQuality);		

	 }

}