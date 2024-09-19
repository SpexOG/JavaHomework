package OOP_Polymorphism;

import OOP_Abstraction.Ex3.B;

class MathOperations {

    public int sum(int a, int b) {

        return a + b;

    }

    public double sum(double a, double b) {

        return a + b;

    }

    public int sum(int a, int b, int c) {

        return a + b + c;

    }

}

class Parent {

    int value = 100;

    void print() {

        System.out.println("Parent class.");

    }

}

class Subclass1 extends Parent {

    @Override
    void print() {

        System.out.println("Subclass1");

    }

}

class Subclass2 extends Parent {

    @Override
    void print() {

        System.out.println("Subclass2");

    }

}

class Child extends Parent {

    int value = 200;

}

class Vehicle {

    public void startEngine() {

        System.out.println("Engine is starting.");

    }

}

class Primate {

    public boolean hasHair() {

        return true;

    }

}

interface HasTail {

    public boolean isTailStripped();

}

class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStripped() {

        return false;

    }

    public int age = 10;

}

class Bird {

    void fly() {

        System.out.println("Bird can fly.");

    }

}

class Sparrow extends Bird {

    void sing() {

        System.out.println("Sparrow can sing.");

    }

}

class Engine {

    void start() {

        System.out.println("Engine starts");

    }

}

class Car {

    private Engine engine;

    Car(Engine engine) {

        this.engine = engine;

    }

    void start() {

        engine.start();

    }

}

public class ExamplesFromPresentationRecreated {
    public static void main(String[] args) {

        //Method Overloading
        MathOperations mathOperations = new MathOperations();

        System.out.println(mathOperations.sum(9, 8));
        System.out.println(mathOperations.sum(9.7, 5.9));
        System.out.println(mathOperations.sum(1, 9, 8));

        //Runtime polymorphism example
        Parent parent;
        parent = new Subclass1();
        parent.print();

        parent = new Subclass2();
        parent.print();

        Parent parent1 = new Child();
        System.out.println(parent1.value);

        Vehicle vehicle = new Vehicle();
        Object vehicleAsObject = vehicle; // vehicleAsObject nu va putea apela metoda startEngine()

        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStripped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        //Lemur lemur1 = primate; -> Nu va compila

        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age);

        double doubleValue = 1.1;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sing();

        Car car = new Car(new Engine());
        car.start();

    }

}
