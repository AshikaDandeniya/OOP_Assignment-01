import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private final ArrayList<Course> coursesEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree.getName());
        for (Course course : coursesEnrolled) {
            System.out.println(course.getName());
        }
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
        degree.setNumberOfStudents(degree.getNumberOfStudents() + 1);
    }

    public void displayDegreeInfo() {
        System.out.println("Degree info: ");
        degree.displayInfo();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        course.setNumberOfStudentsEnrolled(course.getNumberOfStudentsEnrolled() + 1);
    }

    public void unenrollCourse(String name) {
        coursesEnrolled.removeIf(course -> course.getName().equals(name));
    }

    public void listCoursesEnrolled() {
        System.out.println("Courses enrolled: ");
        for (Course course : coursesEnrolled) {
            System.out.println(course.getName());
        }
    }
}
