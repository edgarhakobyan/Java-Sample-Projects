import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        Group group = new Group(1);
        Car car = new Car(3000, "BMW", 10, group);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {

            Car.serializeStatic(outputStream);
            outputStream.writeObject(car);

            Car.staticNumber1 = 1000;
            Car.staticNumber2 = 1000;

            Car.deserializeStatic(inputStream);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
