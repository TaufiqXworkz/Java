public class OverLoadingFunctions{


	// the method with no return type
	public static void laptop(){
		System.out.println("The name of the laptop is: ASUS");
	}
	
	public static void laptop(char name){
		System.out.println("The name of the laptop is:"+name);
		
	}
	
	public static void laptop(char name,int price){
		System.out.println("name: "+name+ " price: "+price);
		
	}
	
	public static void laptop(char name,int price,float gene){
		System.out.println("name: "+name+ " price: "+price+ " gene"+gene);
	 
	}
	
	public static void laptop(char name,int price,float gene, boolean islaptopGood){
		System.out.println("name: "+name+ " price: "+price+ " gene:"+gene+ " laptop is good: "+islaptopGood);
	}
	
	// the method with return type
	public static int laptop(char name,int price,float gene, boolean islaptopGood,int processor){
		System.out.println("name: "+name+ " price: "+price+ " gene:"+gene+ " laptop is good: "+islaptopGood+ "processor: "+processor);
		return price;
	}
	
	public static boolean laptop(char name,int price,float gene, boolean islaptopGood,int processor, int varanty){
		System.out.println("name: "+name+ " price: "+price+ " gene:"+gene+ " laptop is good: "+islaptopGood+ "processor: "+processor+ " varanty:"+varanty);
		return islaptopGood;
	}
	
	public static long laptop(char name,int price,float gene, boolean islaptopGood,int processor, int varanty,int garantee ){
		System.out.println("name: "+name+ " price: "+price+ " gene:"+gene+ " laptop is good: "+islaptopGood+ "processor: "+processor+ " varanty:"+varanty+ " garantee: "+garantee);
		return garantee;
	}
	
	public static double laptop(char name,int price,float gene, boolean islaptopGood,int processor, int varanty,int garantee, double function ){
		System.out.println("name: "+name+ " price: "+price+ " gene:"+gene+ " laptop is good: "+islaptopGood+ "processor: "+processor+ " varanty:"+varanty+ " garantee: "+garantee+" function: "+function);
		return function;
	}
	
	
	
	// method with non primitive data types 
	public static void mobile(String name ){
		String brand ="Ibrand";
		if(name == "IPhone" && brand !="Android" || brand =="Ibrand" ){
			System.out.println("the name of phone is: "+name);
		}
	}
	
	public static void mobile(String name,int price ){
		if(name == "IPhone" && price!=5000 || price ==10000){
			System.out.println("name: "+name+ " price:"+price);
		}
	}


}