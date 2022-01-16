package restdemo.restsimple1;

public class Worker extends Person implements findWork {

    public Worker(String name, int age) {
        super(name, age);
        this.setExpiriense(true);
    }


    @Override
    public String sayPhrase() {
        return null;
    }

    @Override
    public void getResume(String resume) {

    }
}
