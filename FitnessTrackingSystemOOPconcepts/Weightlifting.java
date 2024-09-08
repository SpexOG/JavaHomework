package FitnessTrackingSystemOOPconcepts;

public class Weightlifting {

    float weightLifted;

    public Weightlifting(float weightLifted){

        this.weightLifted = weightLifted;

    }

    public void weightLiftedToday(){

        System.out.println("Greutate ridicata astazi (kg): " + weightLifted);

    }

}
