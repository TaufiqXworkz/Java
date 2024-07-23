public class Library {

    // 10 instance variables
    String libraryName;
    String libraryAddress;
    int totalBooks;
    int totalMembers;
    String libraryTimings;
    char libraryGrade;
    float libraryRating;
    double librarySize;
    String libraryType;
    boolean isOpen;

    // no argument constructor
    public Library() {
        System.out.println("The constructor with no argument is defined");
    }

    // constructor with all arguments
    public Library(String libraryName, String libraryAddress, int totalBooks, int totalMembers,
					String libraryTimings, char libraryGrade, float libraryRating, double librarySize,
					String libraryType, boolean isOpen) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.totalBooks = totalBooks;
        this.totalMembers = totalMembers;
        this.libraryTimings = libraryTimings;
        this.libraryGrade = libraryGrade;
        this.libraryRating = libraryRating;
        this.librarySize = librarySize;
        this.libraryType = libraryType;
        this.isOpen = isOpen;
    }

    // 4 instance methods using 4 ways
    public void issueBook() {
        System.out.println("Book is being issued");
    }

    public void displayLibraryName(String libraryName) {
        System.out.println("Library Name: " + libraryName);
    }

    public boolean isLibraryOpen() {
        System.out.println("Library is open");
        return true;
    }

    public String libraryDetails(String libraryName, int totalBooks) {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        return "Library is Excellent";
    }

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
