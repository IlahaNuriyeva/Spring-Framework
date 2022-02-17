package az.developia.spring;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
@ToString
public class Service {
    @Autowired
    Empoyee empoyee;

    public Empoyee getEmpoyee(){
        return empoyee;
    }

}
