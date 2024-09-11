package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Bicycles;

public class Test {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(5, 2);

        bicycle.applyBrake();

        System.out.println("Gear: " + bicycle.showGear());
        System.out.println("Speed : " + bicycle.showSpeed());

        bicycle.speedUp(7);
        bicycle.changeGear(3);

        System.out.println("Speed : " + bicycle.showSpeed());
        System.out.println("Gear : " + bicycle.showGear());

        MountainBike mountainBike = new MountainBike(5, 2, "Off-Road", "Full-Suspension");

        System.out.println("Gear mtb: " + mountainBike.showGear());
        System.out.println("Speed mtb: " + mountainBike.showSpeed());

        System.out.println("Tire type mtb: " + mountainBike.getTireType());
        System.out.println("Suspension type mtb: " + mountainBike.getSuspension());

        mountainBike.adjustSuspension();

        mountainBike.setSuspension("Hard-tail");
        mountainBike.setTireType("Street");

        System.out.println("Tire type mtb: " + mountainBike.getTireType());
        System.out.println("Suspension type mtb: " + mountainBike.getSuspension());

    }

}