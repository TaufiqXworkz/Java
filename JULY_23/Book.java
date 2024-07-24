/* 1. Create 2 class
1. declare 10 properties for each class and define no-argument constructor, 
all argument constructor and intialize instance variables
2. declare the 4 instance methods using 4 ways
*/

public class Book{

	// 10 instance variables
	String bookName;
	int bookPrice;
	int bookPages;
	String bookAuthor;
	char bookGrade;
	float bookRating;
	double bookSize;
	String bookColor;
	String bookType;
	boolean isAvailable;
	
	//no argument constructor
	public Book(){
		System.out.println("The constructor with no argument is defined");
	}
	
	
	//constructor with all arguments
	public Book(String bookName,int bookPrice,int bookPages,String bookAuthor,char bookGrade,
				float bookRating,double bookSize,String bookColor,String bookType,boolean isAvailable){
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookPages=bookPages;
		this.bookAuthor=bookAuthor;
		this.bookGrade=bookGrade;
		this.bookRating=bookRating;
		this.bookSize=bookSize;
		this.bookColor=bookColor;
		this.bookType=bookType;
		this.isAvailable=isAvailable;
	}
	
	// 4 instance method using 4 ways
	public void bookSelling(){
		System.out.println("Book is selling");
	}
	
	public void bookDisplay(String bookName){
		System.out.println("Book Name:"+bookName);
	}
	
	public boolean bookAvailable(){
		System.out.println("Book is available");
		return true;
	}
	
	public String bookDetails(String bookName,int bookPrice){
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Price:"+bookPrice);
		return "Book is Good";
	}
	
	
	
}