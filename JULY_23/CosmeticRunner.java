public class CosmeticRunner{
	public static void main(String args[]){
		Cosmetic cos= new Cosmetic();
		cos.displayItems();
		cos.cosmeticQuantity();
		cos.cosmeticPrice("Green",8000);
		cos.cosmeticDeatils(true);
	}
}