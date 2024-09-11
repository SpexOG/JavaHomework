package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Nissan", "GT-R", 2024);

        car.start();
        car.accelerate();
        car.stop();

        System.out.println("Car brand: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());

        car.setMake("Mitsubishi");
        car.setModel("Lancer Evolution IX");
        car.setYear(2009);

        System.out.println("Car brand: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());

        ElectricCar electricCar = new ElectricCar("Toyota", "Mirai", 2023, 40000, 300);

        electricCar.charge();

        System.out.println("Electric car brand: " + electricCar.getMake());
        System.out.println("Electric car model: " + electricCar.getModel());
        System.out.println("Electric car year: " + electricCar.getYear());
        System.out.println("Electric car battery capacity: " + electricCar.getBatteryCapacity());
        System.out.println("Electric car range: " + electricCar.getRange());

        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();

        electricCar.setBatteryCapacity(50000);
        electricCar.setRange(500);

        System.out.println("Electric car battery capacity: " + electricCar.getBatteryCapacity());
        System.out.println("Electric car range: " + electricCar.getRange());

        Tesla tesla = new Tesla("Tesla", "model 3", 2020, 60000, 400, 5.2);

        tesla.enableAutopilot();

        System.out.println("Tesla car brand: " + tesla.getMake());
        System.out.println("Tesla car model: " + tesla.getModel());
        System.out.println("Tesla car year: " + tesla.getYear());
        System.out.println("Tesla car battery capacity: " + tesla.getBatteryCapacity());
        System.out.println("Tesla car range: " + tesla.getRange());
        System.out.println("Tesla car autopilot version: " + tesla.getAutopilotVersion());

        tesla.charge();
        tesla.start();
        tesla.accelerate();
        tesla.stop();

        tesla.setAutopilotVersion(1.3);

        tesla.setYear(700);

        System.out.println("Tesla car year: " + tesla.getYear());

        System.out.println("Tesla car autopilot version: " + tesla.getAutopilotVersion());

    }
}