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

    
}
