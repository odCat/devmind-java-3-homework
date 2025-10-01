package homework.chapter3;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal pet = context.getBean("myDog", Dog.class);

        System.out.println(pet.makeSound());

        System.out.println("My pet's name is " + ((Dog) pet).getName());
    }
}
