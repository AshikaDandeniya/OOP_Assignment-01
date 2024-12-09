import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private final ArrayList<Course> coursesOffering = new ArrayList<>();
    private final ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name, Lecturer departmentHead) {
        this.name = name;
        this.departmentHead = departmentHead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department Head: " + departmentHead.getName());
        System.out.println("Courses offered by " + name + " department: ");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }
        System.out.println("Lecturers belongs to the " + name + " department: ");
        for (Lecturer lecturer : lecturersBelongsTo) {
            System.out.println(lecturer.getName());
        }
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        System.out.println("Name: " + departmentHead.getName());
        System.out.println("Position: " + departmentHead.getPosition());
        System.out.println("Department: " + departmentHead.getDepartment().getName());
        departmentHead.listCoursesTeaching();
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(String name) {
        coursesOffering.removeIf(course -> course.getName().equals(name));
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}

