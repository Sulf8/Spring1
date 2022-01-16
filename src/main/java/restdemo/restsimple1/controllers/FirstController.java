package restdemo.restsimple1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restdemo.restsimple1.Person;
import restdemo.restsimple1.DAO.EmploymentCenter;
import java.util.List;

@RestController
@RequestMapping("/work")
public class FirstController {
   private final EmploymentCenter employmentCenter;

   @Autowired
   public FirstController(EmploymentCenter employmentCenter) {
        this.employmentCenter = employmentCenter;
   }

    @GetMapping
    public List<Person> list(){
        return employmentCenter.read();
    }

    @GetMapping("/{id}")
    public Person giveMePerson(@PathVariable(value = "id") int id){
        return employmentCenter.readById(id);
    }

    @PostMapping
    public String createPerson(@RequestBody Person person){
        employmentCenter.create(person);
        return "redirect:/work";
    }

    @PutMapping("/{id}")//хотя это patch
    public String updatePerson(@PathVariable (value = "id") int id, @RequestBody Person person){
       employmentCenter.update(id, person);
       return "redirect:/work";
    }

    @DeleteMapping
    public String deletePerson(@PathVariable (value = "id") int id){
       employmentCenter.delete(id);
        return "redirect:/work";
    }


    

}
