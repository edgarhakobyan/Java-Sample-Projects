package prototype;

class EmployeeRecord implements Prototype {
    private int id;
    private String name;

    EmployeeRecord() {
        System.out.println("*****************");
    }

    EmployeeRecord(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public void showRecord(){
        System.out.println(id + "\t" + name);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name);
    }
}
