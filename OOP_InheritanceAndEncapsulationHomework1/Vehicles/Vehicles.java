package OOP_InheritanceAndEncapsulationHomework1.Vehicles;

import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Bicycles.Bicycle;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Bicycles.MountainBike;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars.Car;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars.ElectricCar;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Cars.Tesla;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft.Boat;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft.FishingBoat;
import OOP_InheritanceAndEncapsulationHomework1.Vehicles.Watercraft.SpeedBoat;

import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean aplicatie = true;

        while (aplicatie) {

            System.out.println("Choose vehicle type: ");
            System.out.println("1 - Bicycles.");
            System.out.println("2 - Cars.");
            System.out.println("3 - Watercraft.");
            System.out.println("4 - Clsoe program.");
            System.out.println();

            int alegere = scanner.nextInt();
            scanner.nextLine();

            switch (alegere) {

                case 1 -> {

                    System.out.println("You chose bicycles!");
                    System.out.println("Choose between a normal bicycle or a mountain bike: ");
                    System.out.println("1 - normal bicycle.");
                    System.out.println("2 - mountain bike.");
                    System.out.println();

                    int choose = scanner.nextInt();
                    scanner.nextLine();

                    switch (choose) {

                        case 1 -> {

                            System.out.println("You chose normal bicycle!");
                            System.out.println("How many speeds (1 to 7) and how many gear (1 to 3) do you want ?");

                            System.out.print("Speeds: ");
                            int speed = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Gears: ");
                            int gear = scanner.nextInt();
                            scanner.nextLine();

                            Bicycle bicycle = new Bicycle(speed, gear);

                            System.out.println();

                            System.out.println("Bicycle speeds: " + bicycle.showGear());
                            System.out.println("Bicycle gears: " + bicycle.showSpeed());

                            System.out.println();

                            System.out.println("Do you want to see another bicycle with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want more speeds, change the number of gears or both? ");
                                    System.out.println("1 - I want more speeds!");
                                    System.out.println("2 - I want to change the number of gears.");
                                    System.out.println("3 - I Want both!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new number of speeds: ");

                                            int newSpeed = scanner.nextInt();
                                            scanner.nextLine();

                                            bicycle.speedUp(newSpeed);

                                            System.out.println("The new speed of bicycle is " + bicycle.showSpeed());
                                            System.out.println();

                                            System.out.println("Do you want to test the bicycle brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    bicycle.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new number of gears: ");

                                            int newGear = scanner.nextInt();
                                            scanner.nextLine();

                                            bicycle.changeGear(newGear);

                                            System.out.println("The new gear of bicycle is " + bicycle.showGear());
                                            System.out.println();

                                            System.out.println("Do you want to test the bicycle brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer1 = scanner.nextLine();

                                            switch (answer1) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    bicycle.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new number of speeds and gear: ");
                                            System.out.print("Speeds: ");

                                            int newSpeed1 = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("Gears: ");
                                            int newGear1 = scanner.nextInt();
                                            scanner.nextLine();

                                            bicycle.speedUp(newSpeed1);
                                            bicycle.changeGear(newGear1);

                                            System.out.println("The new speed of bicycle is " + bicycle.showSpeed());
                                            System.out.println("The new gears of bicycle is " + bicycle.showGear());
                                            System.out.println();

                                            System.out.println("Do you want to test the bicycle brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer2 = scanner.nextLine();

                                            switch (answer2) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    bicycle.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println("Do you want to test the bicycle brakes? ");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String answer3 = scanner.nextLine();

                                    switch (answer3) {

                                        case "1" -> {

                                            System.out.println();
                                            System.out.println("Testing brakes!");
                                            bicycle.applyBrake();

                                            System.out.println();
                                            System.out.println("Thank you!");
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println("Ok, Thank you!");

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        case 2 -> {

                            System.out.println("You chose mountain bike!");
                            System.out.println("Choose speeds (1 to 7), gear (1 to 3), tire type and suspesion! : ");

                            System.out.print("Speeds: ");
                            int speed = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Gears: ");
                            int gear = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Tire type: ");
                            String tireType = scanner.nextLine();

                            System.out.println("Suspension: ");
                            String suspension = scanner.nextLine();

                            MountainBike mountainBike = new MountainBike(speed, gear, tireType, suspension);

                            System.out.println();

                            System.out.println("Mountain bike speeds: " + mountainBike.showGear());
                            System.out.println("Mountain bike gears: " + mountainBike.showSpeed());
                            System.out.println("Mountain bike tire type: " + mountainBike.getTireType());
                            System.out.println("Mountain bike suspension: " + mountainBike.getSuspension());

                            System.out.println();

                            System.out.println("Do you want to see another mountain bike with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want more speeds, change the number of gears, change the tire type, change the suspension or all of them? ");
                                    System.out.println("1 - I want more speeds!");
                                    System.out.println("2 - I want to change the number of gears.");
                                    System.out.println("3 - I want to change the tire type.");
                                    System.out.println("4 - I want to change the suspension.");
                                    System.out.println("5 - I want all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new number of speeds: ");

                                            int newSpeed = scanner.nextInt();
                                            scanner.nextLine();

                                            mountainBike.speedUp(newSpeed);

                                            System.out.println("The new speed of mountain bike is " + mountainBike.showSpeed());
                                            System.out.println();

                                            System.out.println("Do you want to test the mountain bike brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    mountainBike.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new number of gears: ");

                                            int newGear = scanner.nextInt();
                                            scanner.nextLine();

                                            mountainBike.changeGear(newGear);

                                            System.out.println("The new gear of mountain bike is " + mountainBike.showGear());
                                            System.out.println();

                                            System.out.println("Do you want to test the mountain bike brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer1 = scanner.nextLine();

                                            switch (answer1) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    mountainBike.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new tire type: ");

                                            String newTireType = scanner.nextLine();

                                            mountainBike.setTireType(newTireType);

                                            System.out.println("The new gear of mountain bike is " + mountainBike.getTireType());
                                            System.out.println();

                                            System.out.println("Do you want to test the mountain bike brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer1 = scanner.nextLine();

                                            switch (answer1) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    mountainBike.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 4 -> {

                                            System.out.print("Write the new suspension type: ");

                                            String newSuspensionType = scanner.nextLine();

                                            mountainBike.setSuspension(newSuspensionType);

                                            System.out.println("The new gear of mountain bike is " + mountainBike.getSuspension());
                                            System.out.println();

                                            System.out.println("Do you want to test the mountain bike brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer1 = scanner.nextLine();

                                            switch (answer1) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    mountainBike.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                case "2" -> {

                                                    System.out.println("Ok, Thank you!");

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }


                                        }

                                        case 5 -> {

                                            System.out.println("Write the new number of speeds, the new gear, the new tire types and the new suspension types: ");

                                            System.out.print("Speeds: ");
                                            int newSpeed1 = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("Gears: ");
                                            int newGear1 = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.println("Tire type: ");
                                            String tireType1 = scanner.nextLine();

                                            System.out.println("Suspension type: ");
                                            String suspension1 = scanner.nextLine();

                                            mountainBike.speedUp(newSpeed1);
                                            mountainBike.changeGear(newGear1);
                                            mountainBike.setTireType(tireType1);
                                            mountainBike.setSuspension(suspension1);

                                            System.out.println("The new speed of mountain bike is " + mountainBike.showSpeed());
                                            System.out.println("The new gears of mountain bike is " + mountainBike.showGear());
                                            System.out.println("The new tire type of mountain bike is " + mountainBike.getTireType());
                                            System.out.println("The new suspension type of mountain bike is " + mountainBike.getSuspension());
                                            System.out.println();

                                            System.out.println("Do you want to test the mountain bike brakes? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer2 = scanner.nextLine();

                                            switch (answer2) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Testing brakes!");
                                                    mountainBike.applyBrake();

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println("Thank you!");

                                                    System.out.println("Do you want to adjust suspension?");
                                                    System.out.println("1 - yes.");
                                                    System.out.println("2 - no.");

                                                    String chosen = scanner.nextLine();

                                                    switch (chosen) {
                                                        case "1" -> {

                                                            mountainBike.adjustSuspension();

                                                        }

                                                        case "2" -> System.out.println("Ok, Thank you!");

                                                        default -> System.out.println("Wrong chose!");

                                                    }

                                                    System.out.println();
                                                    System.out.println("Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println("Do you want to test the bicycle brakes? ");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String answer3 = scanner.nextLine();

                                    switch (answer3) {

                                        case "1" -> {

                                            System.out.println();
                                            System.out.println("Testing brakes!");
                                            mountainBike.applyBrake();

                                            System.out.println("Do you want to adjust suspension?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String chosen = scanner.nextLine();

                                            switch (chosen) {
                                                case "1" -> {

                                                    mountainBike.adjustSuspension();

                                                }

                                                case "2" -> System.out.println("Ok, Thank you!");

                                                default -> System.out.println("Wrong chose!");

                                            }

                                            System.out.println();
                                            System.out.println("Thank you!");
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println("Do you want to adjust suspension?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String chosen = scanner.nextLine();

                                            switch (chosen) {
                                                case "1" -> {

                                                    mountainBike.adjustSuspension();

                                                }

                                                case "2" -> System.out.println("Ok, Thank you!");

                                                default -> System.out.println("Wrong chose!");

                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        default -> System.out.println("Wrong option!");

                    }

                }

                case 2 -> {

                    System.out.println("You chose cars!");
                    System.out.println("Choose between a normal car, an electric car or a Tesla car: ");
                    System.out.println("1 - normal car.");
                    System.out.println("2 - electric car.");
                    System.out.println("3 - Tesla car.");
                    System.out.println();

                    int choose = scanner.nextInt();
                    scanner.nextLine();

                    switch (choose) {

                        case 1 -> {

                            System.out.println("You chose normal car!");
                            System.out.println("What make, model and year do you want for your car ?");

                            System.out.print("make: ");
                            String make = scanner.nextLine();

                            System.out.print("model: ");
                            String model = scanner.nextLine();

                            System.out.print("year: ");
                            int year = scanner.nextInt();
                            scanner.nextLine();

                            Car car = new Car(make, model, year);

                            System.out.println();

                            System.out.println("Car make: " + car.getMake());
                            System.out.println("Car model: " + car.getModel());
                            System.out.println("Car year: " + car.getYear());

                            System.out.println();

                            System.out.println("Do you want to see another car with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the make, model, year or all of them? ");
                                    System.out.println("1 - I want to change the make!");
                                    System.out.println("2 - I want to change the model!");
                                    System.out.println("3 - I want to change the year!");
                                    System.out.println("4 - I want to change all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new make: ");

                                            String newMake = scanner.nextLine();


                                            car.setMake(newMake);

                                            System.out.println("The new make of car is " + car.getMake());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    car.start();

                                                    System.out.println();
                                                    car.accelerate();

                                                    System.out.println();
                                                    car.stop();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new model of car: ");

                                            String newModel = scanner.nextLine();


                                            car.setModel(newModel);

                                            System.out.println("The new model of car is " + car.getModel());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer1 = scanner.nextLine();

                                            switch (answer1) {

                                                case "1" -> {

                                                    System.out.println();
                                                    car.start();

                                                    System.out.println();
                                                    car.accelerate();

                                                    System.out.println();
                                                    car.stop();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new year of the car: ");

                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();

                                            car.setYear(newYear);

                                            System.out.println("The new year of car is " + car.getYear());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer2 = scanner.nextLine();

                                            switch (answer2) {

                                                case "1" -> {

                                                    System.out.println();
                                                    car.start();

                                                    System.out.println();
                                                    car.accelerate();

                                                    System.out.println();
                                                    car.stop();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 4 -> {

                                            System.out.println("Write the new make, model and year of the car: ");

                                            System.out.print("make: ");
                                            String newMake = scanner.nextLine();

                                            System.out.print("model: ");
                                            String newModel = scanner.nextLine();

                                            System.out.print("year: ");
                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();

                                            car.setMake(newMake);
                                            car.setModel(newModel);
                                            car.setYear(newYear);

                                            System.out.println("The new make of car is " + car.getMake());
                                            System.out.println("The new model of car is " + car.getModel());
                                            System.out.println("The new year of car is " + car.getYear());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    car.start();

                                                    System.out.println();
                                                    car.accelerate();

                                                    System.out.println();
                                                    car.stop();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your car?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            car.start();

                                            System.out.println();
                                            car.accelerate();

                                            System.out.println();
                                            car.stop();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }
                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        case 2 -> {

                            System.out.println("You chose an electric car!");
                            System.out.println("What make, model, year, battery capacity and range do you want for your car ?");

                            System.out.print("make: ");
                            String make = scanner.nextLine();

                            System.out.print("model: ");
                            String model = scanner.nextLine();

                            System.out.print("year: ");
                            int year = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("battery capacity: ");
                            int batteryCapacity = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("range: ");
                            int range = scanner.nextInt();
                            scanner.nextLine();

                            ElectricCar electricCar = new ElectricCar(make, model, year, batteryCapacity, range);

                            System.out.println();

                            System.out.println("Electric car make: " + electricCar.getMake());
                            System.out.println("Electric car model: " + electricCar.getModel());
                            System.out.println("Electric car year: " + electricCar.getYear());
                            System.out.println("Electric car battery capacity: " + electricCar.getBatteryCapacity());
                            System.out.println("Electric car range: " + electricCar.getRange());

                            System.out.println();

                            System.out.println("Do you want to see another car with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the make, model, year, battery capacity, range or all of that? ");
                                    System.out.println("1 - I want to change the make!");
                                    System.out.println("2 - I want to change the model!");
                                    System.out.println("3 - I want to change the year!");
                                    System.out.println("4 - I want to change the battery capacity!");
                                    System.out.println("5 - I want to change the range!");
                                    System.out.println("6 - I want to change all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new make: ");

                                            String newMake = scanner.nextLine();


                                            electricCar.setMake(newMake);

                                            System.out.println("The new make of electric car is " + electricCar.getMake());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new model: ");

                                            String newModel = scanner.nextLine();


                                            electricCar.setModel(newModel);

                                            System.out.println("The new model of electric car is " + electricCar.getModel());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new year: ");

                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();


                                            electricCar.setYear(newYear);

                                            System.out.println("The new year of electric car is " + electricCar.getYear());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 4 -> {

                                            System.out.print("Write the new battery capacity: ");

                                            int newBatteryCapacity = scanner.nextInt();
                                            scanner.nextLine();


                                            electricCar.setBatteryCapacity(newBatteryCapacity);

                                            System.out.println("The new battery capacity of electric car is " + electricCar.getBatteryCapacity());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 5 -> {

                                            System.out.print("Write the new range: ");

                                            int newRange = scanner.nextInt();
                                            scanner.nextLine();


                                            electricCar.setRange(newRange);

                                            System.out.println("The new range of electric car is " + electricCar.getRange());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        case 6 -> {

                                            System.out.println("Write the new make, model, year, battery capacity and range of the electric car: ");

                                            System.out.print("make: ");
                                            String newMake = scanner.nextLine();

                                            System.out.print("model: ");
                                            String newModel = scanner.nextLine();

                                            System.out.print("year: ");
                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("battery capacity: ");
                                            int newBatteryCapacity = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("range: ");
                                            int newRange = scanner.nextInt();
                                            scanner.nextLine();

                                            electricCar.setMake(newMake);
                                            electricCar.setModel(newModel);
                                            electricCar.setYear(newYear);
                                            electricCar.setBatteryCapacity(newBatteryCapacity);
                                            electricCar.setRange(newRange);

                                            System.out.println("The new make of electric car is " + electricCar.getMake());
                                            System.out.println("The new model electric of car is " + electricCar.getModel());
                                            System.out.println("The new year of electric car is " + electricCar.getYear());
                                            System.out.println("The new battery capacity of electric car is " + electricCar.getBatteryCapacity());
                                            System.out.println("The new range of electric car is " + electricCar.getRange());
                                            System.out.println();

                                            System.out.println("The new range of electric car is " + electricCar.getRange());
                                            System.out.println();

                                            System.out.println("Do you want to test the car? ");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String answer = scanner.nextLine();

                                            switch (answer) {

                                                case "1" -> {

                                                    System.out.println();
                                                    electricCar.start();

                                                    System.out.println();
                                                    electricCar.accelerate();

                                                    System.out.println();
                                                    electricCar.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    electricCar.charge();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");

                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your car?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            electricCar.start();

                                            System.out.println();
                                            electricCar.accelerate();

                                            System.out.println();
                                            electricCar.stop();

                                            System.out.println();
                                            System.out.println("Testing charging...");
                                            System.out.println();
                                            electricCar.charge();
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }
                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        case 3 -> {

                            System.out.println("You chose a Tesla car!");
                            System.out.println("What model, year, battery capacity, range and version of autopilot do you want for your car ?");

                            String make = "Tesla";

                            System.out.print("model: ");
                            String model = scanner.nextLine();
                            String modelBun = "";

                            if (model.equalsIgnoreCase("model 3") || model.equalsIgnoreCase("model x") || model.equalsIgnoreCase("model y") || model.equalsIgnoreCase("model s")) {
                                modelBun = model;
                            } else {
                                System.out.println("Modelul de Tesla nu exista!");
                            }

                            System.out.print("year: ");
                            int year = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("battery capacity: ");
                            int batteryCapacity = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("range: ");
                            int range = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Autopilot version: ");
                            double autopilotVersion = scanner.nextDouble();
                            scanner.nextLine();

                            Tesla tesla = new Tesla(make, modelBun, year, batteryCapacity, range, autopilotVersion);

                            System.out.println();

                            System.out.println("Car make: " + tesla.getMake());
                            System.out.println("Tesla car model: " + tesla.getModel());
                            System.out.println("Tesla car year: " + tesla.getYear());
                            System.out.println("Tesla car battery capacity: " + tesla.getBatteryCapacity());
                            System.out.println("Tesla car range: " + tesla.getRange());
                            System.out.println("Tesla car autopilot version: " + tesla.getAutopilotVersion());

                            System.out.println();

                            System.out.println("Do you want to see another car with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the make, model, year, battery capacity, range, autopilot version or all of that? ");
                                    System.out.println("1 - I want to change the model!");
                                    System.out.println("2 - I want to change the year!");
                                    System.out.println("3 - I want to change the battery capacity!");
                                    System.out.println("4 - I want to change the range!");
                                    System.out.println("5 - I want to change the autopilot version!");
                                    System.out.println("6 - I want to change all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new model: ");

                                            String newModel = scanner.nextLine();


                                            tesla.setModel(newModel);

                                            System.out.println("The new model of Tesla car is " + tesla.getModel());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new year: ");

                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();


                                            tesla.setYear(newYear);

                                            System.out.println("The new year of Tesla car is " + tesla.getYear());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new battery capacity: ");

                                            int newBatteryCapacity = scanner.nextInt();
                                            scanner.nextLine();


                                            tesla.setBatteryCapacity(newBatteryCapacity);

                                            System.out.println("The new battery capacity of Tesla car is " + tesla.getBatteryCapacity());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 4 -> {

                                            System.out.print("Write the new range: ");

                                            int newRange = scanner.nextInt();
                                            scanner.nextLine();


                                            tesla.setRange(newRange);

                                            System.out.println("The new range of Tesla car is " + tesla.getRange());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 5 -> {

                                            System.out.print("Write the new autopilot version: ");

                                            double newAutopilotVersion = scanner.nextDouble();
                                            scanner.nextLine();


                                            tesla.setAutopilotVersion(newAutopilotVersion);

                                            System.out.println("The new autopilot version of Tesla car is " + tesla.getAutopilotVersion());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 6 -> {

                                            System.out.println("Write the new model, year, battery capacity, range and autopilot version of the Tesla car: ");

                                            System.out.print("model: ");
                                            String newModel = scanner.nextLine();

                                            System.out.print("year: ");
                                            int newYear = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("battery capacity: ");
                                            int newBatteryCapacity = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("range: ");
                                            int newRange = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.print("autopilot version: ");
                                            double newAutopilotVersion = scanner.nextDouble();
                                            scanner.nextLine();

                                            tesla.setModel(newModel);
                                            tesla.setYear(newYear);
                                            tesla.setBatteryCapacity(newBatteryCapacity);
                                            tesla.setRange(newRange);
                                            tesla.setAutopilotVersion(newAutopilotVersion);

                                            System.out.println("The new model of Tesla car is " + tesla.getModel());
                                            System.out.println("The new year of Tesla car is " + tesla.getYear());
                                            System.out.println("The new battery Tesla of electric car is " + tesla.getBatteryCapacity());
                                            System.out.println("The new range of Tesla car is " + tesla.getRange());
                                            System.out.println("The new autopilot varsion of Tesla car is " + tesla.getAutopilotVersion());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your car?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    tesla.start();

                                                    System.out.println();
                                                    tesla.accelerate();

                                                    System.out.println();
                                                    tesla.stop();

                                                    System.out.println();
                                                    System.out.println("Testing charging...");
                                                    System.out.println();
                                                    tesla.charge();
                                                    System.out.println();

                                                    System.out.println("Testing autopilot");
                                                    tesla.enableAutopilot();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your car?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            tesla.start();

                                            System.out.println();
                                            tesla.accelerate();

                                            System.out.println();
                                            tesla.stop();

                                            System.out.println();
                                            System.out.println("Testing charging...");
                                            System.out.println();
                                            tesla.charge();
                                            System.out.println();

                                            System.out.println("Testing autopilot");
                                            tesla.enableAutopilot();
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }
                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        default -> System.out.println("Wrong option!");

                    }

                }

                case 3 -> {

                    System.out.println("You chose watercraft!");
                    System.out.println("Choose between a normal boat, a fishing boat or a speed boat: ");
                    System.out.println("1 - normal boat.");
                    System.out.println("2 - fishing boat.");
                    System.out.println("3 - speed boat.");
                    System.out.println();

                    int choose = scanner.nextInt();
                    scanner.nextLine();

                    switch (choose) {

                        case 1 -> {

                            System.out.println("You chose normal boat!");
                            System.out.println("What length and weight do you want for your boat ?");

                            System.out.print("length: ");
                            double length = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("weight: ");
                            double weight = scanner.nextDouble();
                            scanner.nextLine();

                            Boat boat = new Boat(length, weight);

                            System.out.println();

                            System.out.println("Boat length: " + boat.getLength());
                            System.out.println("Boat weight: " + boat.getWeight());

                            System.out.println();

                            System.out.println("Do you want to see another boat with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the length, weight, or both of them? ");
                                    System.out.println("1 - I want to change the length!");
                                    System.out.println("2 - I want to change the weight!");
                                    System.out.println("3 - I want to change both!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new length: ");

                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();


                                            boat.setLength(newLength);

                                            System.out.println("The new length of boat is " + boat.getLength());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Boat is testing sailing...");
                                                    boat.sail();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new weight of boat: ");

                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();


                                            boat.setWeight(newWeight);

                                            System.out.println("The new weight of boat is " + boat.getWeight());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Boat is testing sailing...");
                                                    boat.sail();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 3 -> {

                                            System.out.println("Write the new length and weight of the boat: ");

                                            System.out.print("Length: ");
                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Weight: ");
                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();

                                            boat.setLength(newLength);
                                            boat.setWeight(newWeight);

                                            System.out.println("The new length of boat is " + boat.getLength());
                                            System.out.println("The new weight of boat is " + boat.getWeight());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Boat is testing sailing...");
                                                    boat.sail();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your boat?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            System.out.println("Boat is testing sailing...");
                                            boat.sail();
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }

                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        case 2 -> {

                            System.out.println("You chose fishing boat!");
                            System.out.println("What length, weight, fish capacity and type of net do you want for your fishing boat ?");

                            System.out.print("length: ");
                            double length = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("weight: ");
                            double weight = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("fish capacity: ");
                            int fishCapacity = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("type of net: ");
                            String typeOfNet = scanner.nextLine();

                            FishingBoat fishingBoat = new FishingBoat(length, weight, fishCapacity, typeOfNet);

                            System.out.println();

                            System.out.println("Fishing boat length: " + fishingBoat.getLength());
                            System.out.println("Fishing boat weight: " + fishingBoat.getWeight());
                            System.out.println("Fishing boat fish capacity: " + fishingBoat.getFishCapacity());
                            System.out.println("Fishing boat type of net: " + fishingBoat.getTypeOfNet());

                            System.out.println();

                            System.out.println("Do you want to see another fishing boat with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the length, weight, fish capacity, type of net or all of them? ");
                                    System.out.println("1 - I want to change the length!");
                                    System.out.println("2 - I want to change the weight!");
                                    System.out.println("3 - I want to change the fish capacity!");
                                    System.out.println("4 - I want to change the type of net!");
                                    System.out.println("5 - I want to change all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new length: ");

                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();


                                            fishingBoat.setLength(newLength);

                                            System.out.println("The new length of the fishing boat is " + fishingBoat.getLength());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your fishing boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Fishing boat is testing sailing...");
                                                    fishingBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing net casting... ");
                                                    fishingBoat.castNet();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new weight of the fishing boat: ");

                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();


                                            fishingBoat.setWeight(newWeight);

                                            System.out.println("The new weight of the fishing boat is " + fishingBoat.getWeight());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your fishing boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Fishing boat is testing sailing...");
                                                    fishingBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing net casting... ");
                                                    fishingBoat.castNet();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new fish capacity of the fishing boat: ");

                                            int newFishCapacity = scanner.nextInt();
                                            scanner.nextLine();


                                            fishingBoat.setFishCapacity(newFishCapacity);

                                            System.out.println("The new fish capacity of the fishing boat is " + fishingBoat.getFishCapacity());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your fishing boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Fishing boat is testing sailing...");
                                                    fishingBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing net casting... ");
                                                    fishingBoat.castNet();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 4 -> {

                                            System.out.print("Write the new type of net of the fishing boat: ");

                                            String newTypeOfNet = scanner.nextLine();


                                            fishingBoat.setTypeOfNet(newTypeOfNet);

                                            System.out.println("The new type of net of the fishing boat is " + fishingBoat.getTypeOfNet());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your fishing boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Fishing boat is testing sailing...");
                                                    fishingBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing net casting... ");
                                                    fishingBoat.castNet();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 5 -> {

                                            System.out.println("Write the new length, weight, fish capacity and type of net of the fishing boat: ");

                                            System.out.print("Length: ");
                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Weight: ");
                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Fish capacity: ");
                                            int newFishCapacity = scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.println("Type of net: ");
                                            String newTypeOfNet = scanner.nextLine();

                                            fishingBoat.setLength(newLength);
                                            fishingBoat.setWeight(newWeight);
                                            fishingBoat.setFishCapacity(newFishCapacity);
                                            fishingBoat.setTypeOfNet(newTypeOfNet);

                                            System.out.println("The new length of fishing boat is " + fishingBoat.getLength());
                                            System.out.println("The new weight of fishing boat is " + fishingBoat.getWeight());
                                            System.out.println("The new fish capacity of fishing boat is " + fishingBoat.getFishCapacity());
                                            System.out.println("The new type of net of fishing boat is " + fishingBoat.getTypeOfNet());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your fishing boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Fishing boat is testing sailing...");
                                                    fishingBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing net casting... ");
                                                    fishingBoat.castNet();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your fishing boat?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            System.out.println("Fishing boat is testing sailing...");
                                            fishingBoat.sail();
                                            System.out.println();

                                            System.out.println("Testing net casting... ");
                                            fishingBoat.castNet();
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }

                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        case 3 -> {

                            System.out.println("You chose speed boat!");
                            System.out.println("What length, weight, maximum speed and engine type do you want for your speed boat ?");

                            System.out.print("length: ");
                            double length = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("weight: ");
                            double weight = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("maximum speed: ");
                            double maxSpeed = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("engine type: ");
                            String engineType = scanner.nextLine();

                            SpeedBoat speedBoat = new SpeedBoat(length, weight, maxSpeed, engineType);

                            System.out.println();

                            System.out.println("Speed boat length: " + speedBoat.getLength());
                            System.out.println("Speed boat weight: " + speedBoat.getWeight());
                            System.out.println("Speed boat maximum speed: " + speedBoat.getMaxSpeed());
                            System.out.println("Speed boat engine type: " + speedBoat.getEngineType());

                            System.out.println();

                            System.out.println("Do you want to see another speed boat with different specifications? ");
                            System.out.println("1 - yes.");
                            System.out.println("2 - no.");

                            int choose1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (choose1) {

                                case 1 -> {

                                    System.out.println("Do you want to change the length, weight, maximum speed, engine type or all of them? ");
                                    System.out.println("1 - I want to change the length!");
                                    System.out.println("2 - I want to change the weight!");
                                    System.out.println("3 - I want to change the maximum speed!");
                                    System.out.println("4 - I want to change the engine type!");
                                    System.out.println("5 - I want to change all of them!");
                                    System.out.println();

                                    int alegere1 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (alegere1) {

                                        case 1 -> {

                                            System.out.print("Write the new length: ");

                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();


                                            speedBoat.setLength(newLength);

                                            System.out.println("The new length of the speed boat is " + speedBoat.getLength());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your speed boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Speed boat is testing sailing...");
                                                    speedBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing turbo boost... ");
                                                    speedBoat.turboBoost();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 2 -> {

                                            System.out.print("Write the new weight of the fishing boat: ");

                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();


                                            speedBoat.setWeight(newWeight);

                                            System.out.println("The new weight of the speed boat is " + speedBoat.getWeight());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your speed boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Speed boat is testing sailing...");
                                                    speedBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing turbo boost... ");
                                                    speedBoat.turboBoost();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 3 -> {

                                            System.out.print("Write the new maximum speed of the speed boat: ");

                                            double newMaxSpeed = scanner.nextDouble();
                                            scanner.nextLine();


                                            speedBoat.setMaxSpeed(newMaxSpeed);

                                            System.out.println("The new maximum speed of the speed boat is " + speedBoat.getMaxSpeed());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your speed boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Speed boat is testing sailing...");
                                                    speedBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing turbo boost... ");
                                                    speedBoat.turboBoost();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 4 -> {

                                            System.out.print("Write the new engine type of the speed boat: ");

                                            String newEngineType = scanner.nextLine();


                                            speedBoat.setEngineType(newEngineType);

                                            System.out.println("The new engine type of the speed boat is " + speedBoat.getEngineType());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your speed boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Speed boat is testing sailing...");
                                                    speedBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing turbo boost... ");
                                                    speedBoat.turboBoost();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        case 5 -> {

                                            System.out.println("Write the new length, weight, maximum speed and engine type of the speed boat: ");

                                            System.out.print("Length: ");
                                            double newLength = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Weight: ");
                                            double newWeight = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Maximum Speed: ");
                                            double newMaximumSpeed = scanner.nextDouble();
                                            scanner.nextLine();

                                            System.out.print("Engine type: ");
                                            String newEngineType = scanner.nextLine();

                                            speedBoat.setLength(newLength);
                                            speedBoat.setWeight(newWeight);
                                            speedBoat.setMaxSpeed(newMaximumSpeed);
                                            speedBoat.setEngineType(newEngineType);

                                            System.out.println("The new length of the speed boat is " + speedBoat.getLength());
                                            System.out.println("The new weight of the speed boat is " + speedBoat.getWeight());
                                            System.out.println("The new maximum speed of the speed boat is " + speedBoat.getMaxSpeed());
                                            System.out.println("The new engine type of the speed boat is " + speedBoat.getEngineType());
                                            System.out.println();

                                            System.out.println();
                                            System.out.println("Do you want to test your speed boat?");
                                            System.out.println("1 - yes.");
                                            System.out.println("2 - no.");

                                            String alege = scanner.nextLine();
                                            switch (alege) {

                                                case "1" -> {

                                                    System.out.println();
                                                    System.out.println("Speed boat is testing sailing...");
                                                    speedBoat.sail();
                                                    System.out.println();

                                                    System.out.println("Testing turbo boost... ");
                                                    speedBoat.turboBoost();
                                                    System.out.println();

                                                }

                                                case "2" -> {

                                                    System.out.println();
                                                    System.out.println("Ok, Thank you!");
                                                    System.out.println();

                                                }

                                                default -> System.out.println("Wrong option!");
                                            }

                                        }

                                        default -> System.out.println("Wrong option!");

                                    }

                                }

                                case 2 -> {

                                    System.out.println();
                                    System.out.println("Do you want to test your speed boat?");
                                    System.out.println("1 - yes.");
                                    System.out.println("2 - no.");

                                    String alege = scanner.nextLine();
                                    switch (alege) {

                                        case "1" -> {

                                            System.out.println();
                                            System.out.println("Speed boat is testing sailing...");
                                            speedBoat.sail();
                                            System.out.println();

                                            System.out.println("Testing turbo boost... ");
                                            speedBoat.turboBoost();
                                            System.out.println();

                                        }

                                        case "2" -> {

                                            System.out.println();
                                            System.out.println("Ok, Thank you!");
                                            System.out.println();

                                        }

                                        default -> System.out.println("Wrong option!");
                                    }

                                }

                                default -> System.out.println("Wrong option!");

                            }

                        }

                        default -> System.out.println("Wrong option!");

                    }

                }

                case 4 -> aplicatie = false;

                default -> System.out.println("Wrong option!");

            }

        }

        scanner.close();


    }
}