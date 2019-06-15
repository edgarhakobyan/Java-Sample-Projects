package deep.staticmethod;

public class Main {
    public static void main(String[] args) {
        Human human = Human.getHumanInstanceWithAgeAndName(23, "Edgar");
        System.out.println(human);

        Group group = new Group(1);

        Car car = new Car(2500, "BMW", group);
        Car copedCar = Car.deepCopyCar(car);
        copedCar.group.id = 10;
        System.out.println("Original car = " + car);
        System.out.println("Copy car = " + copedCar);
    }
}
