package shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Group group = new Group(1);
        Student student = new Student("Edgar", 24, group);

        try {
            Student clonedStudent = (Student) student.clone();

            System.out.println(student);
            System.out.println(clonedStudent);

            clonedStudent.name = "Name";
            clonedStudent.group.id = 10;

            System.out.println("After clone");

            System.out.println(student);
            System.out.println(clonedStudent);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

//        TestClone obj = new TestClone();
//        TestClone obj1 = (TestClone) obj.clone();
//        TestClone obj2 = obj;
//
//        System.out.println(obj);
//        System.out.println(obj1);
//        System.out.println(obj2);
//
//        obj.i = 11;
//
//        System.out.println(obj);
//        System.out.println(obj1);
//        System.out.println(obj2);
//
//        obj.printThis();
    }

}

class TestClone implements Cloneable {
    public Integer i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void printThis() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return i.toString();
    }
}
