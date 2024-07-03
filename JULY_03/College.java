/* 3. in each class developer needs to declare 9 methods with return type
(include both primitive and non-primitive(String)), in each add 2 if statements
College
Friends
Grocery
BeautyProduct
Camera
*/

public class College {

    // Method 1
    public int checkStudentAge(int age) {
        if (age < 18) {
            System.out.println("Student is a minor.");
        }
        if (age >= 18) {
            System.out.println("Student is an adult.");
        }
        return age;
    }

    // Method 2
    public String checkStudentGrade(double grade) {
        if (grade >= 60) {
            System.out.println("Student passed.");
        }
        if (grade < 60) {
            System.out.println("Student failed.");
        }
        return grade;
    }

    // Method 3
    public String checkFacultyCount(int count) {
        if (count < 10) {
            System.out.println("Not enough faculty.");
        }
        if (count >= 10) {
            System.out.println("Sufficient faculty.");
        }
        return count;
    }

    // Method 4
    public String checkLibraryBooks(int books) {
        if (books < 1000) {
            System.out.println("Library has limited books.");
        }
        if (books >= 1000) {
            System.out.println("Library has ample books.");
        }
        return books;
    }

    // Method 5
    public String checkStudentAttendance(int attendance) {
        if (attendance >= 75) {
            System.out.println("Attendance is satisfactory.");
        }
        if (attendance < 75) {
            System.out.println("Attendance is unsatisfactory.");
        }
        return attendance;
    }

    // Method 6
    public String checkCourseDuration(int duration) {
        if (duration < 3) {
            System.out.println("Course duration is too short.");
        }
        if (duration >= 3) {
            System.out.println("Course duration is adequate.");
        }
        return duration;
    }

    // Method 7
    public String checkCollegeRanking(int rank) {
        if (rank <= 10) {
            System.out.println("College is top-ranked.");
        }
        if (rank > 10) {
            System.out.println("College is not top-ranked.");
        }
        return rank;
    }

    // Method 8
    public String checkSportsFacilities(boolean hasFacilities) {
        if (hasFacilities) {
            System.out.println("College has sports facilities.");
        }
        if (!hasFacilities) {
            System.out.println("College lacks sports facilities.");
        }
        return hasFacilities;
    }

    // Method 9
    public String checkHostelAvailability(boolean hasHostel) {
        if (hasHostel) {
            System.out.println("Hostel is available.");
        }
        if (!hasHostel) {
            System.out.println("Hostel is not available.");
        }
        return hasHostel;
    }
}


