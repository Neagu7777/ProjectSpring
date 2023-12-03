package com.example.projectspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication

public class PersonController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonController.class);

        // Извлекаем Person из контекста 4 раза
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);
        Person person3 = context.getBean(Person.class);
        Person person4 = context.getBean(Person.class);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }

}




