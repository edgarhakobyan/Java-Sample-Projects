package deep.constructor;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student(24, "Edgar", group);
        Student cloned = new Student(student);

        System.out.println(student);
        System.out.println(cloned);
        System.out.println();

        cloned.name = "Test";
        cloned.group.id = 10;

        System.out.println(student);
        System.out.println(cloned);
    }
}
