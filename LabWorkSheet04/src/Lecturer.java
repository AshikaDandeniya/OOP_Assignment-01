import java.util.ArrayList;

public class Lecturer extends Person {
    private String position;
    private Department department;
    private final ArrayList<Course> coursesTeaching = new ArrayList<>();

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Position: " + position);
        System.out.println("Department: " + department.getName());
        System.out.println("Courses teaching: ");
        for (Course course : coursesTeaching) {
            System.out.println(course.getName());
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(String name) {
        coursesTeaching.removeIf(course -> course.getName().equals(name));
    }

    public void listCoursesTeaching() {
        System.out.println("Courses teaching: ");
        for (Course course : coursesTeaching) {
            System.out.println(course.getName());
        }
    }

    public void displayDepartmentInfo() {
        System.out.println("Department info: ");
        department.displayInfo();
    }
}

