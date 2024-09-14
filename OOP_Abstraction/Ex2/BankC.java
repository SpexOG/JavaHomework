package OOP_Abstraction.Ex2;

public class BankC extends Bank{

    private double balance = 200;

    @Override
    public void getBalance(){

        System.out.println("Your balance is " + balance + "$.");

    }

}
