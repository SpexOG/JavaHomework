package OOP_Abstraction.Ex3;

public class A extends Marks{

    private double CS;
    private double AI;
    private double DSA;

    public A(double CS, double AI, double DSA){

        this.CS = CS;
        this.AI = AI;
        this.DSA = DSA;

    }

    @Override
    public void getPercentage(){

        double percentage = ((CS + AI + DSA) / 3) * 10;

        System.out.println("Percentage of student A: " + percentage + "%.");

    }

}
