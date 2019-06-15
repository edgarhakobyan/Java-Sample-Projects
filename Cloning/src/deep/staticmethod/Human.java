package deep.staticmethod;

public class Human {
    private int age;
    private String name;

    public Human() {}

    public static Human getHumanInstanceWithAgeAndName(int age, String name) {
        Human human = new Human();
        human.age = age;
        human.name = name;
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
