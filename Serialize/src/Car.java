import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String model;
    public static int staticNumber1;
    public static int staticNumber2;
    private transient int transientInt;
    private Group group;

    public Car() {}

    Car(int price, String model, int transientInt, Group group) {
        this.price = price;
        this.model = model;
        staticNumber1 = price;
        staticNumber2 = price;
        this.transientInt = transientInt;
        this.group = group;
    }

    public static void serializeStatic(ObjectOutputStream oos) throws IOException {
        oos.writeInt(staticNumber2);
    }

    public static void deserializeStatic(ObjectInputStream ois) throws IOException {
        staticNumber2 = ois.readInt();
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", staticNumber1='" + staticNumber1 + '\'' +
                ", staticNumber2='" + staticNumber2 + '\'' +
                ", transientInt='" + transientInt + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
