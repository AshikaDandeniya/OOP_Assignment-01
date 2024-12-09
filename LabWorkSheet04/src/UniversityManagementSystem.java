public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create and configure objects
        Department softwareEngineering = new Department("Software Engineering", null);
        Degree computerScience = new Degree("Computer Science", 0);
        Course oopCourse = new Course("Object-Oriented Programming", "Compulsory", 0, null, computerScience);

        Lecturer lecturer = new Lecturer("Dr. Kumar", "Senior Lecturer", softwareEngineering);
        Student student = new Student("Alice", "CS2021", "Second Year", computerScience);

        softwareEngineering.appointDepartmentHead(lecturer);
        softwareEngineering.offerCourse(oopCourse);

        computerScience.offerCourse(oopCourse);
        oopCourse.addLecturerInCharge(lecturer);

        student.enrollCourse(oopCourse);

        // Display information
        softwareEngineering.displayInfo();
        computerScience.displayInfo();
        oopCourse.displayInfo();
        lecturer.displayInfo();
        student.displayInfo();
    }
}

