package az.developia.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Getter
@Setter
@ToString

public class Person {
    private String id;
    private String name;
    private Department department;
    private Location location;


    public Person(Long id, String name) {
        this.id = String.valueOf(id);
        this.name = name;
    }

    public Person() {
    }
    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Lazy
    @Autowired
    public void setLocation(Location location) {
        this.location = location;
    }


    public Location getLocation() {
        return location;
    }
}
