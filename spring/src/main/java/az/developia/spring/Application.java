package az.developia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);

        var context = new AnnotationConfigApplicationContext("az.developia.spring");
        var emp = context.getBean(Empoyee.class);
        System.out.println(emp);

        var emp2 = context.getBean(Service.class);
        System.out.println(emp2);

        var person = context.getBean(Person.class);
        System.out.println(person);

    }
}
