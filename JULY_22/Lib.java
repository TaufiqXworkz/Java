public class Lib{

public String book_name;
public byte book_taken_day;
public boolean is_useful;
public long no_of_books;


public Lib(){
	this ("Thermodynamics");
	
	System.out.println("No argument with default constructor");
}
public Lib(String book_name){
	this ("Thermodynamics",true);
	this.book_name=book_name;
	System.out.println("The Game Name is:"+book_name);
	
}

public Lib(String book_name,boolean is_useful){
	this (1000000L,(byte)2,true);
	this.book_name=book_name;
	this.is_useful=is_useful;
	System.out.println("The Book Name is:"+book_name);

	System.out.println("Library play major Roleis:"+is_useful);
	
}
public Lib (long no_of_books,byte book_taken_day,boolean is_useful){
	this ("Thermodynamics",true,(byte)2,1000000L);
	this.book_taken_day=book_taken_day;
	this.is_useful=is_useful;
	this.no_of_books=no_of_books;
	
	System.out.println("The  Book Taken per day is:"+book_taken_day);
	System.out.println("Library play major Roleis:"+is_useful);
	System.out.println("Total number of books:"+no_of_books);
}

public Lib(String book_name,boolean is_useful,byte book_taken_day,long no_of_books){
	this.book_name=book_name;
	this.book_taken_day=book_taken_day;
	this.is_useful=is_useful;
	this.no_of_books=no_of_books;
	System.out.println("The Book Name is:"+book_name);
	System.out.println("The  Book Taken per day is:"+book_taken_day);
	System.out.println("Library play major Roleis:"+is_useful);
	System.out.println("Total number of books:"+no_of_books);
}
	public  int info(){
	System.out.println("Collection of Books");
	return 1;
	}
	public  String info(int price,String book){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	return book;
	}
	public  int info (long no_of_books,int price,String book){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	System.out.println("Total Books In Library is:"+no_of_books);
	
	return 1;
	}
	public  int info(long no_of_books,int price,String book,boolean is_useful){
	System.out.println("Price of Books"+price);
	System.out.println("Book Name is:"+book);
	System.out.println("Total Books In Library is:"+no_of_books);
	System.out.println("Is Library is Useful For Study:"+is_useful);
	return price;
	}

}