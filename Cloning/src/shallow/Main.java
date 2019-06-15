package shallow;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Edgar", 24, group);

        try {
            Student clonedStudent = (Student) student.clone();

            System.out.println(student);
            System.out.println(clonedStudent);

            clonedStudent.name = "Name";
            clonedStudent.group.id = 10;

            System.out.println("After clone");

            System.out.println(student);
            System.out.println(clonedStudent);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
