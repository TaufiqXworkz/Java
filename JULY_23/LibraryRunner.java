public class  LibraryRunner{

	// main method
    public static void main(String args[]) {
        Library library1 = new Library();

        Library library2 = new Library("City Library", "123 Main St", 5000, 1200, "9 AM - 8 PM", 'A', 9.5f, 2000.5, "Public", true);

        Library library3 = new Library();
        library3.issueBook();
        library3.displayLibraryName("Downtown Library");
        library3.isLibraryOpen();
        library3.libraryDetails("City Library", 5000);
    }


}