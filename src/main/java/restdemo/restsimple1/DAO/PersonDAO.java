package restdemo.restsimple1.DAO;

import restdemo.restsimple1.Person;

import java.util.List;

public interface PersonDAO {
    void create(Person person);
    List<Person> read ();
    void update (int id, Person person);
    void delete(int id);
}
