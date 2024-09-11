package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Bicycles;

public class Bicycle {

    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {

        if (speed >= 1 && speed <= 7) {

            this.speed = speed;

        } else {

            System.out.println("Wrong speed!");

        }

        if (gear >= 1 && gear <= 3) {

            this.gear = gear;

        } else {

            System.out.println("Wrong gear!");

        }

    }

    public void changeGear(int gear) {

        if (gear != this.gear && gear <= 3 && gear >= 1) {

            this.gear = gear;

        } else {

            System.out.println("Choose an available gear (1 to 3), that is not equal with previous gear!");
            System.out.println("Gear unchanged!");

        }

    }

    public void speedUp(int speed) {

        if (speed > this.speed && speed <= 7) {

            this.speed = speed;

        } else if (speed <= this.speed && speed > 0) {

            System.out.println("Speed cannot be lower than initial speed or equal with it!");
            System.out.println("Speed unchanged!");

        } else {

            System.out.println("Choose an available speed (1 to 7): ");
            System.out.println("Speed unchanged!");

        }

    }

    public int showGear() {

        return gear;

    }

    public int showSpeed() {

        return speed;

    }

    public void applyBrake() {

        System.out.println("Apply braking: " + true);

    }

}