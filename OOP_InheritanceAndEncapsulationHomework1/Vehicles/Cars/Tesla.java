package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars;

public class Tesla extends ElectricCar {

    private double autopilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, double autopilotVersion) {

        super("Tesla", model, year, batteryCapacity, range);

        if (autopilotVersion > 0) {

            this.autopilotVersion = autopilotVersion;

        } else {

            System.out.println("Wrong autopilot version");

        }

    }

    public void enableAutopilot() {

        System.out.println("Autopilot enabled: " + true);

    }

    public double getAutopilotVersion() {

        return autopilotVersion;

    }

    public void setAutopilotVersion(double autopilotVersion) {

        if (autopilotVersion > 0) {

            this.autopilotVersion = autopilotVersion;

        } else {

            System.out.println("Wrong autopilot version");
            System.out.println("Version of autopilot unchanged!");

        }

    }

}