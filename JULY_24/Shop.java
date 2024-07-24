/* 5. Write a program to store the shop names and 
the developer needs to Perform the Create and Read operation.*/

public class Shop{
	
	String[] shopItems= new String[4];
	int index=0;
	public int getShopItemList(){
		return shopItems.length;
	}
	
	public String insertItemOfShop(String itemName){
		if(this.index<this.getShopItemList()){
			shopItems[index]=itemName;
			index++;
		}else{
			System.out.println("The Shop Items are OverLoaded");
		}
		return "The item is added successfully";
	}
	
	public void readItemsInShop(){
		for(int i=0; i<shopItems.length; i++){
			System.out.println("-"+shopItems[i]);
		}
	}

}