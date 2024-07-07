public class School {
 
    public static void checkInitialize() {
        String schoolName = "BVB";
        int totalStudents = 500;
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
    }

    public static void displayStudentInfo(String studentName, int studentAge) {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }

    public static String[] getSubjects() {
        String[] subjects = {"Math", "Science", "English", "History"};
		System.out.println("The subjects are:");
		for(int i =0 ; i<subjects.length ; i++ ){
			System.out.println("- "+subjects[i]);
		}
        return subjects;
    }

    public static int[] getStudentMarks(String studentName) {
        int[] marks = {85, 90, 78, 88};
		System.out.println("The total marks of the subjects are");
		for(int i =0 ; i<marks.length ; i++ ){
			System.out.println("- "+marks[i]);
		}
        return marks;
    }
}