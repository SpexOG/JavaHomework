package OOP_Abstraction.Ex4;

public abstract class AbstractClass{

    public AbstractClass(){

        System.out.println("This is constructor of abstract class!");

    }

    abstract void a_method();

    public void nonAbstractClass(){

        System.out.println("This is a normal method of abstract class!");

    }

}
