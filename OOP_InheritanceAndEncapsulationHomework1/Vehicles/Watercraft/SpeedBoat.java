package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft;

public class SpeedBoat extends Boat{

    private double maxSpeed;
    private String engineType;

    public SpeedBoat(double length, double weight, double maxSpeed, String engineType){

        super(length, weight);

        if (maxSpeed > 0){

            this.maxSpeed = maxSpeed;

        }else {

            System.out.println("Max speed is wrong!");

        }

        if (engineType != null){

            this.engineType = engineType;

        }else {

            System.out.println("Engine type is wrong!");

        }

    }

    public void turboBoost(){

        System.out.println("Turbo boost enabled: " + true);

    }

    public double getMaxSpeed() {

        return maxSpeed;

    }

    public void setMaxSpeed(double maxSpeed) {

        if (maxSpeed > 0){

            this.maxSpeed = maxSpeed;

        }else {

            System.out.println("Max speed is wrong!");
            System.out.println("Max speed is unchanged!");

        }

    }

    public String getEngineType() {

        return engineType;

    }

    public void setEngineType(String engineType) {

        if (engineType != null){

            this.engineType = engineType;

        }else {

            System.out.println("Engine type is wrong!");
            System.out.println("Engine type is unchanged!");

        }

    }

}