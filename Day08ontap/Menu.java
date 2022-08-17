package Day08ontap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int menu(){
        int useChoice;
        System.out.println("Press 1: Create");
        System.out.println("Press 2: Display");
        System.out.println("Press 3: Exit");
        System.out.println("Enter choice: ");
        useChoice = in.nextInt();
        return useChoice;
    }
}
 interface IAnimal {
    void sound();
}
class Duck extends Animal{
    private String colour;

    public Duck() {
    }

    public Duck(String colour, String name) {
        super(name);
        this.colour = colour;
    }

    @Override
    public void sound() {
        System.out.println("Wack Wack");    }

    @Override
    public String toString() {
        return "Duck{"+super.toString() + "colour=" + colour + '}';
    }
}
class Dog extends Animal {

    private boolean isHome;

    public Dog() {
    }

    public Dog(boolean isHome, String name) {
        super(name);
        this.isHome = isHome;
    }

    @Override
    public void sound() {
        System.out.println("Gow Gow");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "isHome=" + isHome + '}';
    }
}
class Cat extends Animal {
    private boolean isMilk;

    public Cat() {
    }


    public Cat(boolean isMilk, String name) {
        super(name);
        this.isMilk = isMilk;
    }
    @Override
    public void sound() {
        System.out.println("Moe Moe");
    }

    @Override
    public String toString() {
        return "Cat{"+super.toString() + "isMilk=" + isMilk + '}';
    }
}
class AnimalList {

    private List<Animal> myAnimals = new ArrayList<>();

    public AnimalList() {
        Animal ani01 = new Dog(true, "BullDog");
        Animal ani02 = new Cat(true, "Meo");
        Animal ani03 = new Duck("yellow", "BullDog");
        myAnimals.add(ani01);
        myAnimals.add(ani03);
        myAnimals.add(ani02);
    }

    public void create(Animal tempAnimal) {
        myAnimals.add(tempAnimal);
    }

    public void display() {
        for (Animal mine : myAnimals) {
            System.out.println("" + mine.toString());
            mine.sound();
        }
    }
}
class Animal implements IAnimal{

    protected String name;
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Animal Sound");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
}
class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        int choice;
        while (true) {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                    Animal a = new Duck("red", "Duck02");
                    animalList.create(a);
                    break;
                case 2:
                    animalList.display();
                    break;
                case 3:

                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}