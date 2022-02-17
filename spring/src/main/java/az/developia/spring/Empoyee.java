package az.developia.spring;
import java.lang.annotation.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Documented
@interface ClassPreamble{
    String author();
    String date();
    String information();
}
@ClassPreamble(
        author = "Ilaha Nuriyeva",
        date = "15/02/2022",
        information = "This is the annotation for information"
)
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Data
@Component
@Repository
@PropertySource(value = "application.properties")



public class Empoyee  {

    @Value("${emp.id}")
    private String id;

    @Value("${emp.firstName}")
    private String firstName;

    @Value("${emp.lastName}")
    private String lastName;


    public Empoyee(Long id, String firstName, String lastName) {

        this.id = String.valueOf(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Empoyee() {
    }
}
