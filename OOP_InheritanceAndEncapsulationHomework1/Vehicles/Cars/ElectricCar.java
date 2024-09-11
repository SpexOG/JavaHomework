package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {

        super(make, model, year);

        if (batteryCapacity > 0) {

            this.batteryCapacity = batteryCapacity;

        } else {

            System.out.println("Wrong battery capacity!");

        }

        if (range > 0) {

            this.range = range;

        } else {

            System.out.println("Wrong range autonomy!");

        }

    }

    public void charge() {

        System.out.println("Car is charging!");

    }

    public int getBatteryCapacity() {

        return batteryCapacity;

    }

    public void setBatteryCapacity(int batteryCapacity) {

        if (batteryCapacity > 0) {

            this.batteryCapacity = batteryCapacity;

        } else {

            System.out.println("Wrong battery capacity!");
            System.out.println("Battery autonomy unchanged!");

        }

    }

    public int getRange() {

        return range;

    }

    public void setRange(int range) {

        if (range > 0) {

            this.range = range;

        } else {

            System.out.println("Wrong range autonomy!");
            System.out.println("Battery range unchanged!");

        }

    }

}