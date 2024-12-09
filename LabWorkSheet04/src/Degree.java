import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private final ArrayList<Course> coursesOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Courses offering: ");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(String name) {
        coursesOffering.removeIf(course -> course.getName().equals(name));
    }

    public void listCoursesOffering() {
        System.out.println("Courses offering: ");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }
    }
}

