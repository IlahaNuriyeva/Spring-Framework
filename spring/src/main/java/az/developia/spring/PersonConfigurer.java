package az.developia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfigurer {
    @Bean
    public Person person(){
        return new Person(5l, "Ilaha Nuriyeva");
    }


    @Bean
    public Department department(){
        return new Department("IT");
        }

    @Bean
    public Location location(){
        return new Location("Azerbaijan");
    }

}
