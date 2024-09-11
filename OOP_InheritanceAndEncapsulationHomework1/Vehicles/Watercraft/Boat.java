package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft;

public class Boat {

    private double length;
    private double weight;

    public Boat(double length, double weight) {

        if (length > 0 && length > weight){

            this.length = length;

        }else if (length > 0 && length < weight){

            System.out.println("Length cannot be less than weight!");

        }else {

            System.out.println("Wrong length!");

        }

        if (weight > 0 && weight < length){

            this.weight = weight;

        }else if (weight > 0 && weight > length){

            System.out.println("Weight cannot be higher than length!");

        }else {

            System.out.println("Wrong weight!");

        }

    }

    public void sail(){

        System.out.println("The boat is sailing: " + true);

    }

    public double getWeight() {

        return weight;

    }

    public void setWeight(double weight) {

        if (weight > 0 && weight < length){

            this.weight = weight;

        }else if (weight > 0 && weight > length){

            System.out.println("Weight cannot be higher than length!");
            System.out.println("Weight unchanged!");

        }else {

            System.out.println("Wrong weight!");
            System.out.println("Weight unchanged!");

        }

    }

    public double getLength() {

        return length;

    }

    public void setLength(double length) {

        if (length > 0 && length > weight){

            this.length = length;

        }else if (length > 0 && length < weight){

            System.out.println("Length cannot be less than weight!");
            System.out.println("Length unchanged!");

        }else {

            System.out.println("Wrong length!");
            System.out.println("Length unchanged!");

        }

    }

}