package OOP_Abstraction.Ex2;

public class BankB extends Bank{

    private double balance = 150;

    @Override
    public void getBalance(){

        System.out.println("Your balance is " + balance + "$.");

    }

}
