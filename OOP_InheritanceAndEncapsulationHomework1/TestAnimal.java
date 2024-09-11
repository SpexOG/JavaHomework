package OOP_InheritanceAndEncapsulationHomework1;

public class TestAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.sound();

        Dog dog = new Dog();

        dog.sound();

        Cat cat = new Cat();

        cat.sound();

        Wolf wolf = new Wolf();

        wolf.sound();

    }
}

class Animal{

    void sound(){

        System.out.println("Animal makes sounds.");

    }

}

class Dog extends Animal{

    @Override
    void sound(){

        System.out.println("Bark!");

    }

}

class Cat extends Animal{

    @Override
    void sound(){

        System.out.println("Meow!");

    }

}

class Wolf extends Animal{

    @Override
    void sound (){

        System.out.println("Howl!");

    }

}
