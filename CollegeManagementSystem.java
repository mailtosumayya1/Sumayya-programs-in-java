class College {
    String collegeName;
    College(String name) {
        collegeName = name;
    }
    void displayCollege() {
        System.out.println("College: " + collegeName);
    }
}
class Faculty extends College {
    String facultyName;
    String department;
    Faculty(String collegeName, String fName, String dept) {
        super(collegeName);
        facultyName = fName;
        department = dept;
    }
    void displayFaculty() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Department: " + department);
    }
}
class Student extends College {
    String studentName;
    int studentID;
    Student(String collegeName, String sName, int id) {
        super(collegeName);
        studentName = sName;
        studentID = id;
    }
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
    }
}
class StudentMarks extends College {
    int studentID;
    int marks;
    StudentMarks(String collegeName, int id, int m) {
        super(collegeName);
        studentID = id;
        marks = m;
    }
    void displayMarks() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Marks: " + marks);
    }
}
public class CollegeManagementSystem {
    public static void main(String[] args) {
        Faculty f = new Faculty("My College", "Mr. John", "Mathematics");
        Student s = new Student("My College", "Alice", 123);
        StudentMarks sm = new StudentMarks("My College", 123, 95);
        f.displayCollege();
        f.displayFaculty();
        System.out.println();
        s.displayCollege();
        s.displayStudent();
        System.out.println();
        sm.displayCollege();
        sm.displayMarks();
    }
}
