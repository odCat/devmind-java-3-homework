package homework.chapter3;


public class Dog implements IAnimal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String makeSound() {
        return "Bark";
    }
}
