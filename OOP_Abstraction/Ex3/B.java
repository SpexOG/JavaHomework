package OOP_Abstraction.Ex3;

public class B extends Marks{

    private double biology;
    private double history;
    private double geography;
    private double english;

    public B(double biology, double history, double geography, double english){

        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.english = english;

    }

    @Override
    public void getPercentage(){

        double percentage = ((biology + history + geography + english) / 4) * 10;

        System.out.println("Percentage of student A: " + percentage + "%.");

    }

}
