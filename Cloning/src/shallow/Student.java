package shallow;

public class Student implements Cloneable {
    public String name;
    public int age;
    public Group group;

    public Student() { }

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
