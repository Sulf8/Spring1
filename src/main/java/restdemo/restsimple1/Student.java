package restdemo.restsimple1;

//делаем допущение, что на момент старта ни один студент не работает, хотя наиболее правильным бы вообще сохранять
//в базе сразу персоны, а в классе ввести например поле статус, где значение из enum
public class Student extends Person implements findWork{

    public Student(String name, int age) {
        super(name, age);
        this.setExpiriense(false);
    }

    @Override
    public String sayPhrase() {
        return null;
    }

    @Override
    public void getResume(String resume) {

    }
}
