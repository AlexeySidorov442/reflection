package test1;
public class Dog extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }

    public String type;
    private String color;
    public Dog() {

    }
    private Dog(int age) {

    }
}
