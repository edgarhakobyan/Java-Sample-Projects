package prototype;

class PrototypeDemo {
    public static void main(String[] args) {
        int id = 5;
        String name = "John";

        EmployeeRecord e1 = new EmployeeRecord(id, name);
        e1.showRecord();

        System.out.println("\n");

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
