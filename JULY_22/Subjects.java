public class Subjects{

public String subject_name;
public byte score;
public boolean is_useful;
public long book_code;


public Subjects (){
	this ("Thermodynamics");
	
	System.out.println("No argument with default constructor");
}
public Subjects (String subject_name){
	this ("Thermodynamics",true);
	this.subject_name=subject_name;
	System.out.println("The Game Name is:"+subject_name);
	
}

public Subjects (String subject_name,boolean is_useful){
	this (1000000L,(byte)90,true);
	this.subject_name=subject_name;
	this.is_useful=is_useful;
	System.out.println("The Book Name is:"+subject_name);

	System.out.println("Thermodynamics Subject Is scoring Subject:"+is_useful);
	
}
public Subjects  (long book_code,byte score,boolean is_useful){
	this ("Thermodynamics",true,(byte)90,1000000L);
	this.score=score;
	this.is_useful=is_useful;
	this.book_code=book_code;
	
	System.out.println("The Obtain is:"+score);
	System.out.println("Thermodynamics Subject Is scoring Subject:"+is_useful);
	System.out.println("Book code:"+book_code);
}

public Subjects (String subject_name,boolean is_useful,byte score,long book_code){
	this.subject_name=subject_name;
	this.score=score;
	this.is_useful=is_useful;
	this.book_code=book_code;
	System.out.println("The Book Name is:"+subject_name);
	System.out.println("The Obtain is:"+score);
	System.out.println("Thermodynamics Subject Is scoring Subject:"+is_useful);
	System.out.println("Book code:"+book_code);
}
public  int sub(){
	System.out.println("Collection of Books");
	return 1;
	}
	public  String sub(int price,String book){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	return book;
	}
	public  int sub (long no_of_books,int price,String book){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	System.out.println("Total Books In Library is:"+no_of_books);
	
	return 1;
	}
	public  int sub(long no_of_books,int price,String book,boolean is_useful){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	System.out.println("Total Books In Library is:"+no_of_books);
	System.out.println("Is Library is Useful For Study:"+is_useful);
	return price;
	}

}