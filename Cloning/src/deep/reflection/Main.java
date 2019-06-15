package deep.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Cow originalCow = new Cow("Milk", 3, 1, group);
        Cow copiedCow = reflectionCopy(originalCow);
        System.out.println(originalCow);
        System.out.println(copiedCow);
    }

    private static Cow reflectionCopy(Cow cow) {
        Cow copiedCow = cow;

        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");
            Field group = Cow.class.getDeclaredField("group");

            name.setAccessible(true);
            head.setAccessible(true);
            group.setAccessible(true);

            name.set(copiedCow, "New name");
            head.set(copiedCow, 2);
            group.set(copiedCow, new Group(2));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return copiedCow;
    }
}
