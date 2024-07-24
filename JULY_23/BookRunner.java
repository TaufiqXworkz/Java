public class BookRunner{

	// main method
	public static void main(String args[]){
		Book book1 = new Book();
		
		Book book2 = new Book("Fire", 220,300,"APJ Abdul kalam",'A',9.8f,20,"Black","Motivation",true);
		
		Book book3 = new Book();
		book3.bookSelling();
		book3.bookDisplay("Heaven");
		book3.bookAvailable();
		book3.bookDetails("Wings of fire",220);
	}



}