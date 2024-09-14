package OOP_Abstraction.Ex2;

// Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively.
// 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.

public class Main {
    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();

    }

}
