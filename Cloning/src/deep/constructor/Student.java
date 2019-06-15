package deep.constructor;

public class Student {
    public int age;
    public String name;
    public Group group;

    public Student(int age, String name, Group group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public Student(Student copyStudent) {
        this(copyStudent.age, copyStudent.name, copyStudent.group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
