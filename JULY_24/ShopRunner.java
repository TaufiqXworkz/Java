public class ShopRunner{

	public static void main(String args[]){
		
		Shop shop=new Shop();
		int length=shop.getShopItemList();
		System.out.println("length:"+length);
		
		shop.insertItemOfShop("Idli Rava");
		shop.insertItemOfShop("Rice");
		shop.insertItemOfShop("Dal");
		shop.insertItemOfShop("Ginger Paste");
		
		shop.readItemsInShop();
	}

}