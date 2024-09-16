package OOP_Abstraction.Ex2;

public class BankA extends Bank{

    private double balance = 100;

    @Override
    public void getBalance(){

        System.out.println("Your balance is " + balance + "$.");

    }

}
