package restdemo.restsimple1.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import restdemo.restsimple1.*;
import restdemo.restsimple1.exceptions.NOT_FOUNDException;

import java.util.List;

@Component
//когда приляпаю норм бд, переписать
public class EmploymentCenter implements PersonDAO {
    private final TempDB db;

    @Autowired
    public EmploymentCenter(TempDB db) {
        this.db = db;
    }

    public TempDB getDb() {
        return db;
    }

    @Override
    public void create(Person person) {
        if (person.getAge() <= 18) {
            this.getDb().getPersonList().add(new Student(person.getName(), person.getAge()));//ломбок?? посмотреть видос
        } else {
            this.getDb().getPersonList().add(new Worker(person.getName(), person.getAge()));//ломбок?? посмотреть видос
        }
    }

    @Override
    public List<Person> read() {
        return this.getDb().getPersonList();
    }

    public Person readById(int id) {
        return this.getDb().getPersonList().stream()
                .filter(i -> i.getId() == id)
                .findFirst().orElseThrow(NOT_FOUNDException::new);
    }


    @Override
    public void update(int id, Person person) {
        readById(id).setName(person.getName());
        readById(id).setAge(person.getAge());
    }

    @Override
    public void delete(int id) {
        Person person = readById(id);//выскочит NOT_FOUNDException, а при removeIf() нет
        this.getDb().getPersonList().remove(person);
    }
}
