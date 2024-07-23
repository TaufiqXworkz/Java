public class Products{
	public String product_name;
	public byte rating;
	public boolean is_good;
	public int price;

	public Products (){
	System.out.println("No argument with default constructor");
}
	public Products (String product_name,byte rating,boolean is_good,int price){
		this.product_name=product_name;
		this.rating=rating;
		this.is_good=is_good;
		this.price=price;
	System.out.println("Product Name"+product_name);
	System.out.println("Product rating"+rating);
	System.out.println("Product is useful"+is_good);
	System.out.println("Product Price"+price);
}

	
	
	
	
public static void info(String prd_name,int price1){
	System.out.println("product name is :"+prd_name);
	System.out.println("Price is :"+price1);
	int dis_prd=30;
	int price_to_value=dis_prd%100*dis_prd;
	double no_disc_price=price1-price_to_value;
	if(prd_name=="Mobile"){
		System.out.println(prd_name+"Product discount is 30%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price);
	System.out.println(price_to_value);
	}
public static void detail(String prd_name2,int price2){
	System.out.println("product name is :"+prd_name2);
	System.out.println("Price is :"+price2);
	int dis_prd1=10;
	int price_to_value1=dis_prd1%100*dis_prd1;
	double no_disc_price1=price2-price_to_value1;
	if(prd_name2=="Bag"){
		System.out.println(prd_name2+"Product discount is 10%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price1);
	System.out.println(price_to_value1);
	}
public static void collection(String prd_name3,int price3){
	System.out.println("product name is :"+prd_name3);
	System.out.println("Price is :"+price3);
	int dis_prd3=45;
	int price_to_value2=dis_prd3%100*dis_prd3;
	double no_disc_price2=price3-price_to_value2;
	if(prd_name3=="Laptop"){
		System.out.println(prd_name3+"Product discount is 45%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price2);
	System.out.println(price_to_value2);
	}
public static void prices(String prd_name4,int price4){
	System.out.println("product name is :"+prd_name4);
	System.out.println("Price is :"+price4);
	int dis_prd4=7;
	int price_to_value3=dis_prd4%100*dis_prd4;
	double no_disc_price3=price4-price_to_value3;
	if(prd_name4=="Cloth"){
		System.out.println(prd_name4+"Product discount is 7%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price3);
	System.out.println(price_to_value3);
	}
public static void information(String prd_name5,int price5){
	System.out.println("product name is :"+prd_name5);
	System.out.println("Price is :"+price5);
	int dis_prd5=15;
	int price_to_value4=dis_prd5%100*dis_prd5;
	double no_disc_price4=price5-price_to_value4;
	if(prd_name5=="Chair"){
		System.out.println(prd_name5+"Product discount is 15%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price4);
	System.out.println(price_to_value4);
	}


}