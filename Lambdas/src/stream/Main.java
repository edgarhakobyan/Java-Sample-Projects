package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 30));
        persons.add(new Person("Андрей", 14));
        persons.add(new Person("Александр", 28));
        persons.add(new Person("Анна", 8));
        persons.add(new Person("Евгений", 25));

        persons.stream()
                .filter(person -> person.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println();
        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

//        for (Person p: persons) {
//            System.out.println(p);
//        }

//        persons.stream().forEach(System.out::println);

//        persons.stream().forEach(person -> System.out.println(person));
    }
}
