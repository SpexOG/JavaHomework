package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Bicycles;

public class MountainBike extends Bicycle {

    private String tireType;
    private String suspension;

    public MountainBike(int speed, int gear, String tireType, String suspension) {

        super(speed, gear);

        if (tireType != null){

            this.tireType = tireType;

        }else {

            System.out.println("Wrong tire type!");

        }

        if (suspension != null){

            this.suspension = suspension;

        }else {

            System.out.println("Wrong suspension type!");

        }

    }

    public void adjustSuspension() {

        System.out.println("Suspension adjusted!");

    }

    public String getTireType() {

        return tireType;

    }

    public void setTireType(String tireType) {

        if (tireType != null){

            this.tireType = tireType;

        }else {

            System.out.println("Wrong tire type!");
            System.out.println("Tire type unchanged!");

        }

    }

    public String getSuspension() {

        return suspension;

    }

    public void setSuspension(String suspension) {

        if (suspension != null){

            this.suspension = suspension;

        }else {

            System.out.println("Wrong suspension type!");
            System.out.println("Suspension type unchanged!");

        }

    }

}