public class Course {
    // INSTANCE VARIABLES — each Course object has its own
    String courseName;
    int studentsRegistered;

    // STATIC VARIABLE — shared across ALL Course objects (one copy total)
    static int totalStudentsUniversityWide = 0;

    // Constructor
    public Course(String courseName, int studentsRegistered) {
        this.courseName = courseName;
        this.studentsRegistered = studentsRegistered;
        totalStudentsUniversityWide += studentsRegistered;
    }

    public double calculateAveragePassPercentage(int passedStudents) {
        double passRate = ((double) passedStudents / studentsRegistered) * 100;
        return passRate;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Students registered: " + studentsRegistered);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 40);
        Course course2 = new Course("Database Systems", 35);
        Course course3 = new Course("Networking", 28);

        course1.displayCourseInfo();
        double c1PassRate = course1.calculateAveragePassPercentage(32);
        System.out.println("Pass rate: " + c1PassRate + "%\n");

        course2.displayCourseInfo();
        double c2PassRate = course2.calculateAveragePassPercentage(30);
        System.out.println("Pass rate: " + c2PassRate + "%\n");

        course3.displayCourseInfo();
        double c3PassRate = course3.calculateAveragePassPercentage(25);
        System.out.println("Pass rate: " + c3PassRate + "%\n");

        System.out.println("=== University-Wide Statistics ===");
        System.out.println("Total students registered across all courses: " + totalStudentsUniversityWide);
    }
}
