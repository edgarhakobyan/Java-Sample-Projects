package deep.reflection;

public class Cow {
    private String name;
    private int age;
    private int head;
    private Group group;

    public Cow(String name, int age, int head, Group group) {
        this.name = name;
        this.age = age;
        this.head = head;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", head=" + head +
                ", group=" + group +
                '}';
    }
}
