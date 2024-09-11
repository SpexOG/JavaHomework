package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft;

public class Test {
    public static void main(String[] args) {

        Boat boat = new Boat(30.4, 20.5);

        boat.sail();

        System.out.println("Boat length: " + boat.getLength());
        System.out.println("Boat weight: " + boat.getWeight());

        boat.setLength(30);
        boat.setWeight(20);

        System.out.println("Boat length: " + boat.getLength());
        System.out.println("Boat weight: " + boat.getWeight());

        SpeedBoat speedBoat = new SpeedBoat(30.6, 25.3, 250, "V12");

        speedBoat.turboBoost();

        System.out.println("Speed boat length: " + speedBoat.getLength());
        System.out.println("Speed boat weight: " + speedBoat.getWeight());
        System.out.println("Speed boat max speed: " + speedBoat.getMaxSpeed());
        System.out.println("Speed boat engine type: " + speedBoat.getEngineType());

        speedBoat.setMaxSpeed(180);
        speedBoat.setEngineType("W16");

        System.out.println("Speed boat max speed: " + speedBoat.getMaxSpeed());
        System.out.println("Speed boat engine type: " + speedBoat.getEngineType());

        FishingBoat fishingBoat = new FishingBoat(52.2, 36.4, 870, "Hexagonal Layer");

        fishingBoat.castNet();

        System.out.println("Fishing boat length: " + fishingBoat.getLength());
        System.out.println("Fishing boat weight: " + fishingBoat.getWeight());
        System.out.println("Fishing boat fish capacity: " + fishingBoat.getFishCapacity());
        System.out.println("Fishing boat type of net: " + fishingBoat.getTypeOfNet());

        fishingBoat.setFishCapacity(900);
        fishingBoat.setTypeOfNet("Pentagonal Layer");

        System.out.println("Fishing boat fish capacity: " + fishingBoat.getFishCapacity());
        System.out.println("Fishing boat type of net: " + fishingBoat.getTypeOfNet());

    }

}