package deep.staticmethod;

public class Car {
    private int weight;
    private String model;
    public Group group;

    public Car() {
    }

    public Car(int weight, String model, Group group) {
        this.weight = weight;
        this.model = model;
        this.group = group;
    }

    public static Car deepCopyCar(Car carToCopy) {
        Car copiedCar = new Car();
        copiedCar.weight = carToCopy.weight;
        copiedCar.model = carToCopy.model;
        copiedCar.group = carToCopy.group;
        return copiedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", group=" + group +
                '}';
    }
}
