package restdemo.restsimple1;

public class Person {
   protected static int count=0;
   private int id;
   private String name;
   private int age;
   private boolean expiriense;

    public Person(String name, int age) {
        this.id = ++count;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getExpiriense() {
        return expiriense;
    }

    public void setExpiriense(boolean expiriense) {
        this.expiriense = expiriense;
    }
}
