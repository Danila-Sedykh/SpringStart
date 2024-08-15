package org.example;

import org.example.configs.MyConfig;
import org.example.entities.Cat;
import org.example.entities.Dog;
import org.example.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);


        Cat cat = applicationContext.getBean(Cat.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        Parrot parrot = applicationContext.getBean("parrot", Parrot.class);
        WeekDay weekDay = applicationContext.getBean(WeekDay.class);

        System.out.println(weekDay.getWeekDayName());
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}