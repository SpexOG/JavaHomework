package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft;

public class FishingBoat extends Boat{

    //fishCapacity, typeOfNet
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat (double length, double weight, int fishCapacity, String typeOfNet){

        super(length, weight);

        if (fishCapacity > 0){

            this.fishCapacity = fishCapacity;

        }else {

            System.out.println("Wrong fish capacity!");

        }

        if (typeOfNet != null){

            this.typeOfNet = typeOfNet;

        }else {

            System.out.println("Wrong type of net!");

        }

    }

    public void castNet(){

        System.out.println("The net is casting: " + true);

    }

    public int getFishCapacity() {

        return fishCapacity;

    }

    public void setFishCapacity(int fishCapacity) {

        if (fishCapacity > 0){

            this.fishCapacity = fishCapacity;

        }else {

            System.out.println("Wrong fish capacity!");
            System.out.println("Fish capacity is unchanged!");

        }

    }

    public String getTypeOfNet() {

        return typeOfNet;

    }

    public void setTypeOfNet(String typeOfNet) {

        if (typeOfNet != null){

            this.typeOfNet = typeOfNet;

        }else {

            System.out.println("Wrong type of net!");
            System.out.println("The type of net is unchanged!");

        }

    }

}