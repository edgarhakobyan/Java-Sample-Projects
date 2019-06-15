package deep.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Milk", 200, 5);

        ByteArrayOutputStream outputStream = null;
        ObjectOutputStream output = null;
        ByteArrayInputStream inputStream = null;
        ObjectInputStream input = null;

        try {
            outputStream = new ByteArrayOutputStream();
            output = new ObjectOutputStream(outputStream);

            output.writeObject(cow);

            inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            input = new ObjectInputStream(inputStream);

            Cow clonedCow = (Cow) input.readObject();
            System.out.println(cow);
            System.out.println(clonedCow);

            clonedCow.setAge(2);
            System.out.println(cow);
            System.out.println(clonedCow);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    output.close();
                }
                if (output != null) {
                    output.flush();
                    output.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
