package restdemo.restsimple1;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TempDB {
    private List<Person> personList;//заместо Table

    {
        personList = new ArrayList<Person>() {{
            add(new Student("Lelik", 20));
            add(new Student("Bolik", 17));//->не входил в фильтр по возможности работать
            add(new Worker("Jumshut", 37));
            add(new Worker("Arkasha", 33));
            add(new Worker("Petr", 64));//->не входил в фильтр по годам до пенсии
        }};
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
