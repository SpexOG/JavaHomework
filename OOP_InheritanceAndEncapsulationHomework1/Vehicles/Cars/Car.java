package OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars;

import java.time.LocalDate;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {

        if (make != null) {

            this.make = make;

        }else {

            System.out.println("Wrong make name!");

        }

        if (model != null){

            this.model = model;

        }else {

            System.out.println("Wrong model name!");

        }


        LocalDate dateNow;
        dateNow = LocalDate.now();

        if (year >= 1900 && year <= dateNow.getYear()) {

            this.year = year;

        } else if (year < 1900) {

            System.out.println("Too old year for cars");

        } else if (year > dateNow.getYear()) {

            System.out.println("You choose an year from future!");

        }

    }

    public void start() {

        System.out.println("Car is starting!");

    }

    public void stop() {

        System.out.println("Car is stopping!");

    }

    public void accelerate() {

        System.out.println("Car is accelerating!");

    }

    public String getMake() {

        return make;

    }

    public void setMake(String make) {

        if (make != null) {

            this.make = make;

        }else {

            System.out.println("Wrong make name!");
            System.out.println("Make unchanged!");

        }


    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        if (model != null){

            this.model = model;

        }else {

            System.out.println("Wrong model name!");
            System.out.println("Model unchanged!");

        }

    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        LocalDate dateNow;
        dateNow = LocalDate.now();

        if (year >= 1900 && year <= dateNow.getYear()) {

            this.year = year;

        } else if (year < 1900) {

            System.out.println("Too old year for cars");
            System.out.println("Year unchanged!");

        } else if (year > dateNow.getYear()) {

            System.out.println("You choose an year from future!");
            System.out.println("Year unchanged!");

        }

    }

}