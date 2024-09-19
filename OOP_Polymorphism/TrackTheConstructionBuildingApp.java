package OOP_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

class Admin extends User {

    private String role;
    private String name;

    public Admin(String role, String name) {

        super(role, name);

        this.role = role;
        this.name = name;

    }

    public String getRole() {

        return role;

    }

    public String getName() {

        return name;

    }

    @Override
    public void seeAllEmployees(Scanner scanner) {

        boolean alege3 = true;
        boolean choice = true;
        boolean choice1 = true;

        String manager = new String();
        String engineer = new String();

        while (alege3) {

            while (choice) {

                System.out.println();
                System.out.println("Do you have a manager in your team?");
                System.out.println("1 - Yes");
                System.out.println("2 - No");
                System.out.println();

                String alege = scanner.nextLine();

                switch (alege) {

                    case "1" -> {

                        System.out.println();
                        System.out.println("What is his name?");
                        System.out.println("Manager name: ");
                        manager = scanner.nextLine();
                        System.out.println();
                        choice = false;

                    }

                    case "2" -> {

                        System.out.println();
                        System.out.println("Ok");
                        System.out.println();
                        choice = false;

                    }

                    default -> System.out.println("Invalid option");

                }

            }

            while (choice1) {

                System.out.println();
                System.out.println("Do you have an engineer in your team?");
                System.out.println("1 - Yes");
                System.out.println("2 - No");
                System.out.println();

                String alege1 = scanner.nextLine();

                switch (alege1) {

                    case "1" -> {

                        System.out.println();
                        System.out.println("What is his name?");
                        System.out.println("Engineer name: ");
                        engineer = scanner.nextLine();
                        System.out.println();
                        choice1 = false;

                    }

                    case "2" -> {

                        System.out.println();
                        System.out.println("Ok");
                        System.out.println();
                        choice1 = false;

                    }

                    default -> System.out.println("Invalid option");

                }

            }

            if (manager.isEmpty() && engineer.isEmpty()){

                System.out.println();
                System.out.println("You have no engineer and manager employed!");
                System.out.println();
                alege3 = false;

            } else if (manager.isEmpty() && !engineer.isEmpty()) {

                System.out.println();
                System.out.println("Your engineer is: " + engineer);
                System.out.println("You have no manager employed!");
                System.out.println();
                alege3 = false;

            } else if (!manager.isEmpty() && engineer.isEmpty()) {

                System.out.println();
                System.out.println("Your manager is: " + manager);
                System.out.println("You have no engineer employed!");
                System.out.println();
                alege3 = false;

            } else if (!manager.isEmpty() && !engineer.isEmpty()) {

                System.out.println();
                System.out.println("Your manager is: " + manager);
                System.out.println("Your manager is: " + engineer);
                System.out.println();
                alege3 = false;

            }

        }

        if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty() && (manager.isEmpty() || engineer.isEmpty())) {

            System.out.println("You have also no employees (constructors, drivers or workers) yet!");

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.size() > 0) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");

            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && workers.size() > 0 && drivers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (drivers.size() > 0 && workers.size() > 0 && constructors.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }

            System.out.println();

        } else if (drivers.size() > 0 && workers.isEmpty() && constructors.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }

            System.out.println();

        } else if (workers.size() > 0 && constructors.isEmpty() && drivers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("You have no other employees yet!");

        }

    }

    public void fireEmployee(Scanner scanner) {

        if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("You can fire nobody because you have no employee yet!");

        } else {

            boolean bool = true;

            while (bool) {

                System.out.println();
                System.out.println("What employee do you want to fire (what category)?");
                System.out.println("1 - Constructors.");
                System.out.println("2 - Drivers.");
                System.out.println("3 - Workers.");
                System.out.println("4 - Back");
                String fired = scanner.nextLine();
                System.out.println();
                switch (fired) {

                    case "1" -> {

                        if (constructors.isEmpty()) {

                            System.out.println("You have no Constructors employed yet.");

                        } else {

                            System.out.println("Constructor list is: ");
                            System.out.println();
                            for (String s : constructors) {

                                System.out.println(s);

                            }

                            System.out.println();
                            System.out.println("Who will be fired?");
                            String firedEmployee = scanner.nextLine();
                            System.out.println();

                            if (constructors.contains(firedEmployee) && constructors.size() > 1) {

                                System.out.println();
                                System.out.println("Constructor " + constructors.get(0) + " was fired!");
                                System.out.println();
                                constructors.remove(firedEmployee);
                                System.out.println("The Constructor leader is: " + constructors.get(0));
                                System.out.println();

                            } else if (!constructors.contains(firedEmployee)) {

                                System.out.println("This name did not exist in the list!");

                            } else {

                                System.out.println();
                                System.out.println("He is the only one in the Constructor team!");
                                System.out.println("So you can not fire him.");
                                System.out.println();

                            }

                            bool = false;

                        }

                    }

                    case "2" -> {

                        if (drivers.isEmpty()) {

                            System.out.println("You have no Drivers employed yet.");

                        } else {

                            System.out.println("Drivers list is: ");
                            System.out.println();
                            for (String s : drivers) {

                                System.out.println(s);

                            }

                            System.out.println();
                            System.out.println("Who will be fired?");
                            String firedEmployee = scanner.nextLine();
                            System.out.println();

                            if (drivers.contains(firedEmployee) && drivers.size() > 1) {

                                System.out.println();
                                System.out.println("Driver " + drivers.get(0) + "was fired!");
                                System.out.println();
                                drivers.remove(firedEmployee);
                                System.out.println("The Driver leader is: " + drivers.get(0));
                                System.out.println();

                            } else if (!drivers.contains(firedEmployee)) {

                                System.out.println("This name did not exist in the list!");

                            } else {

                                System.out.println();
                                System.out.println("He is the only one in the Driver team!");
                                System.out.println("So you can not fire him.");
                                System.out.println();

                            }

                            bool = false;

                        }

                    }

                    case "3" -> {

                        if (workers.isEmpty()) {

                            System.out.println("You have no Drivers employed yet.");

                        } else {

                            System.out.println("Workers list is: ");
                            System.out.println();
                            for (String s : workers) {

                                System.out.println(s);

                            }

                            System.out.println();
                            System.out.println("Who will be fired?");
                            String firedEmployee = scanner.nextLine();
                            System.out.println();

                            if (workers.contains(firedEmployee) && workers.size() > 1) {

                                System.out.println();
                                System.out.println("Worker " + workers.get(0) + "was fired!");
                                System.out.println();
                                workers.remove(firedEmployee);
                                System.out.println("The Workers leader is: " + workers.get(0));
                                System.out.println();

                            } else if (!workers.contains(firedEmployee)) {

                                System.out.println("This name did not exist in the list!");

                            } else {

                                System.out.println();
                                System.out.println("He is the only one in the Workers team!");
                                System.out.println("So you can not fire him.");
                                System.out.println();

                            }

                            bool = false;

                        }

                    }

                    case "4" -> bool = false;

                    default -> System.out.println("Wrong option!");

                }

            }
        }

    }

    public void changeConstructionDetails(Scanner scanner) {

        boolean choice = true;

        while (choice) {

            System.out.println();
            System.out.println("What do you want to change?");
            System.out.println("1 - Place of building.");
            System.out.println("2 - Building project.");
            System.out.println("3 - Shape of building.");
            System.out.println("4 - Back");
            System.out.println();
            String alegere = scanner.nextLine();
            System.out.println();

            switch (alegere) {

                case "1" -> {

                    System.out.println("Place of building was changed succesfully!");
                    choice = false;

                }

                case "2" -> {

                    System.out.println("Building project was changed succesfully!");
                    choice = false;

                }

                case "3" -> {

                    System.out.println("Shape of building was changed succesfully!");
                    choice = false;

                }

                case "4" -> choice = false;

                default -> System.out.println("Wrong option!");

            }

        }

    }

}

class User implements EmployeesResourcesAndAnnouncements {

    ArrayList<String> constructors = new ArrayList<>();
    ArrayList<String> drivers = new ArrayList<>();
    ArrayList<String> workers = new ArrayList<>();

    private String role;
    private String name;

    public User(String role, String name) {

        this.role = role;
        this.name = name;

    }

    public String getRole() {

        return role;

    }

    public String getName() {

        return name;

    }

    @Override
    public void announce(Scanner scanner) {

        if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("You have no employes yet!");

        } else {

            System.out.println();
            System.out.print("Introduce the employee announce: ");
            String announce = scanner.nextLine();
            System.out.println(announce);
            System.out.println();
            System.out.println("E-mail sent to all employees!");
            System.out.println();

        }

    }

    @Override
    public void teams() {

        if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("You have no employees yet!");

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.size() > 0) {

            System.out.println("Available teams are: Constructors, Drivers and workers.");

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.isEmpty()) {

            System.out.println("Available teams are: Constructors and Drivers.");

        } else if (constructors.size() > 0 && workers.size() > 0 && drivers.isEmpty()) {

            System.out.println("Available teams are: Constructors and workers.");

        } else if (drivers.size() > 0 && workers.size() > 0 && constructors.isEmpty()) {

            System.out.println("Available teams are: Drivers and workers.");

        } else if (constructors.size() > 0 && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("Available team is: Constructors.");

        } else if (drivers.size() > 0 && workers.isEmpty() && constructors.isEmpty()) {

            System.out.println("Available team is: Drivers.");

        } else if (workers.size() > 0 && constructors.isEmpty() && drivers.isEmpty()) {

            System.out.println("Available team is: Workers.");

        }

    }

    @Override
    public void getConstructorsRoleAndNames(Scanner scanner) {

        System.out.print("Number of constructors: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Constructor name: ");
            constructors.add(scanner.nextLine());

        }

        System.out.println("Constructor leader is: " + constructors.get(0));

    }

    @Override
    public void getDriversRoleAndNames(Scanner scanner) {

        System.out.print("Number of Drivers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Driver name: ");
            drivers.add(scanner.nextLine());

        }

        System.out.println("Driver leader is: " + drivers.get(0));

    }

    @Override
    public void getWorkersRoleAndNames(Scanner scanner) {

        System.out.print("Number of workers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Workers name: ");
            workers.add(scanner.nextLine());

        }

        System.out.println("Worker leader is: " + workers.get(0));

    }

    @Override
    public void seeAllEmployees(Scanner scanner) {

        String engineer = "engineer";
        String manager = "manager";

        if (this.role.equalsIgnoreCase(engineer)) {

            System.out.println();
            System.out.println("The " + getRole() + " of team is " + getName());
            System.out.println();

            System.out.println("Who is your manager? ");
            String managerName = scanner.nextLine();
            System.out.println("The manager is: " + managerName);

        } else if (this.role.equalsIgnoreCase(manager)) {

            System.out.println();
            System.out.println("The " + getRole() + " of team is " + getName());
            System.out.println();

            System.out.println("Who is your engineer? ");
            String engineerName = scanner.nextLine();
            System.out.println("The engineer is: " + engineerName);

        }

        if (constructors.isEmpty() && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println("You have no employees yet!");

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.size() > 0) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && drivers.size() > 0 && workers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i <= constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && workers.size() > 0 && drivers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (drivers.size() > 0 && workers.size() > 0 && constructors.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }
            System.out.println();
            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        } else if (constructors.size() > 0 && drivers.isEmpty() && workers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Constructors is " + constructors.get(0) + " and his team is: ");
            for (int i = 1; i < constructors.size(); i++) {

                System.out.println(constructors.get(i));

            }

            System.out.println();

        } else if (drivers.size() > 0 && workers.isEmpty() && constructors.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Drivers is " + drivers.get(0) + " and his team is: ");
            for (int i = 1; i < drivers.size(); i++) {

                System.out.println(drivers.get(i));

            }

            System.out.println();

        } else if (workers.size() > 0 && constructors.isEmpty() && drivers.isEmpty()) {

            System.out.println();

            System.out.println("The leader of Workers is " + workers.get(0) + " and his team is: ");
            for (int i = 1; i < workers.size(); i++) {

                System.out.println(workers.get(i));

            }

            System.out.println();

        }

    }

    @Override
    public void changeConstructorRoles(Scanner scanner) {

        if (constructors.isEmpty()) {

            System.out.println("You have no constructors employee!");

        } else {

            System.out.println();
            System.out.println("These are the constructors: ");
            for (String s : constructors) {

                System.out.println(s);

            }
            System.out.println();
            System.out.println("Cine vrei sa fie noul lider?");
            String liderNou = scanner.nextLine();
            if (constructors.contains(liderNou)) {

                constructors.add(0, liderNou);

            }
            System.out.println();
            System.out.println("Liderul nou este: " + constructors.get(0));
            System.out.println();

        }

    }

    @Override
    public void changeDriversRoles(Scanner scanner) {

        if (drivers.isEmpty()) {

            System.out.println("You have no drivers employee!");

        } else {

            System.out.println();
            System.out.println("These are the drivers: ");
            for (String s : drivers) {

                System.out.println(s);

            }
            System.out.println();
            System.out.println("Cine vrei sa fie noul lider?");
            String liderNou = scanner.nextLine();
            if (drivers.contains(liderNou)) {

                drivers.add(0, liderNou);

            }
            System.out.println();
            System.out.println("Liderul nou este: " + drivers.get(0));
            System.out.println();

        }

    }

    @Override
    public void changeWorkersRoles(Scanner scanner) {

        if (workers.isEmpty()) {

            System.out.println("You have no workers employee!");

        } else {

            System.out.println();
            System.out.println("These are the workers: ");
            for (String s : workers) {

                System.out.println(s);

            }
            System.out.println();
            System.out.println("Cine vrei sa fie noul lider?");
            String liderNou = scanner.nextLine();
            if (workers.contains(liderNou)) {

                workers.add(0, liderNou);

            }
            System.out.println();
            System.out.println("Liderul nou este: " + workers.get(0));
            System.out.println();

        }

    }

    @Override
    public void availableResources() {

        System.out.println("Available resources are: pipes, blocks and wood.");

    }

    @Override
    public void neededResources() {

        System.out.println("Needed resources are: iron, titan and carbon.");

    }

}

interface EmployeesResourcesAndAnnouncements {

    void announce(Scanner scanner);

    void teams();

    void changeConstructorRoles(Scanner scanner);

    void changeDriversRoles(Scanner scanner);

    void changeWorkersRoles(Scanner scanner);

    void getConstructorsRoleAndNames(Scanner scanner);

    void getDriversRoleAndNames(Scanner scanner);

    void getWorkersRoleAndNames(Scanner scanner);

    void availableResources();

    void neededResources();

    void seeAllEmployees(Scanner scanner);

}

public class TrackTheConstructionBuildingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean value = true;

        while (value) {

            System.out.println("Who are you?");
            System.out.println();
            System.out.println("1 - Admin");
            System.out.println("2 - Manager / Engineer");
            System.out.println("3 - Exit");
            System.out.println();

            String who = scanner.nextLine();

            String role = new String();
            if (who.equalsIgnoreCase("1")){

                role = "Admin";

            } else if (who.equalsIgnoreCase("2")) {

                boolean decision = true;

                while (decision) {

                    System.out.println();
                    System.out.println("Are you a manager or an engineer?");
                    System.out.println();
                    System.out.println("1 - Manager");
                    System.out.println("2 - Engineer");
                    System.out.println();

                    String choice3 = scanner.nextLine();

                    switch (choice3) {

                        case "1" -> {

                            role = "Manager";
                            decision = false;

                        }
                        case "2" -> {

                            role = "Engineer";
                            decision = false;

                        }

                        default -> {

                            System.out.println("Invalid option!");

                        }
                    }

                }

            }

            if (who.equalsIgnoreCase("1") || who.equalsIgnoreCase("2")) {

                switch (who) {

                    case "1" -> {

                        System.out.println();
                        System.out.println("What is your name?");
                        String adminName = scanner.nextLine();
                        Admin admin = new Admin(role, adminName);

                        System.out.println("Hello to our admin" + ": " + adminName + "!");

                        System.out.println();

                        boolean choice = true;

                        while (choice) {
                            System.out.println();
                            System.out.println("What do you want to do?");
                            System.out.println("1 - Display my role");
                            System.out.println("2 - Display my name");
                            System.out.println("3 - See all employees");
                            System.out.println("4 - Fire an employee");
                            System.out.println("5 - Change construction details");
                            System.out.println("6 - Made an announce");
                            System.out.println("7 - Display all the teams");
                            System.out.println("8 - Add Construction roles and assign the Leader (First added will be the leader)");
                            System.out.println("9 - Add Drivers roles and assign the Leader (First added will be the leader)");
                            System.out.println("10 - Add Workers roles and assign the Leader (First added will be the leader)");
                            System.out.println("11 - Change the Constructors role");
                            System.out.println("12 - Change the Drivers role");
                            System.out.println("13 - Change the Workers role");
                            System.out.println("14 - Display the available resources");
                            System.out.println("15 - Display the needed resources");
                            System.out.println("16 - Go back");
                            System.out.println();

                            String alege = scanner.nextLine();

                            switch (alege) {

                                case "1" -> System.out.println(admin.getRole());

                                case "2" -> System.out.println(admin.getName());

                                case "3" -> admin.seeAllEmployees(scanner);

                                case "4" -> admin.fireEmployee(scanner);

                                case "5" -> admin.changeConstructionDetails(scanner);

                                case "6" -> admin.announce(scanner);

                                case "7" -> admin.teams();

                                case "8" -> admin.getConstructorsRoleAndNames(scanner);

                                case "9" -> admin.getDriversRoleAndNames(scanner);

                                case "10" -> admin.getWorkersRoleAndNames(scanner);

                                case "11" -> admin.changeConstructorRoles(scanner);

                                case "12" -> admin.changeDriversRoles(scanner);

                                case "13" -> admin.changeWorkersRoles(scanner);

                                case "14" -> admin.availableResources();

                                case "15" -> admin.neededResources();

                                case "16" -> choice = false;

                                default -> {

                                    System.out.println();
                                    System.out.println("Wrong option!");
                                    System.out.println();

                                }

                            }

                        }

                    }

                    case "2" -> {

                        System.out.println();
                        System.out.println("What is your name?");
                        String userName = scanner.nextLine();
                        User user = new User(role, userName);

                        System.out.println("Hello to our " + user.getRole() + ": " + userName + "!");

                        System.out.println();

                        boolean choice = true;

                        while (choice) {
                            System.out.println();
                            System.out.println("What do you want to do?");
                            System.out.println("1 - Display my role");
                            System.out.println("2 - Display my name");
                            System.out.println("3 - See all employees");
                            System.out.println("4 - Made an announce");
                            System.out.println("5 - Display all the teams");
                            System.out.println("6 - Add Construction roles and assign the Leader (First added will be the leader)");
                            System.out.println("7 - Add Drivers roles and assign the Leader (First added will be the leader)");
                            System.out.println("8 - Add Workers roles and assign the Leader (First added will be the leader)");
                            System.out.println("9 - Change the Constructors role");
                            System.out.println("10 - Change the Drivers role");
                            System.out.println("11 - Change the Workers role");
                            System.out.println("12 - Display the available resources");
                            System.out.println("13 - Display the needed resources");
                            System.out.println("14 - Go back");
                            System.out.println();

                            String alege = scanner.nextLine();

                            switch (alege) {

                                case "1" -> System.out.println(user.getRole());

                                case "2" -> System.out.println(user.getName());

                                case "3" -> user.seeAllEmployees(scanner);

                                case "4" -> user.announce(scanner);

                                case "5" -> user.teams();

                                case "6" -> user.getConstructorsRoleAndNames(scanner);

                                case "7" -> user.getDriversRoleAndNames(scanner);

                                case "8" -> user.getWorkersRoleAndNames(scanner);

                                case "9" -> user.changeConstructorRoles(scanner);

                                case "10" -> user.changeDriversRoles(scanner);

                                case "11" -> user.changeWorkersRoles(scanner);

                                case "12" -> user.availableResources();

                                case "13" -> user.neededResources();

                                case "14" -> choice = false;

                                default -> {

                                    System.out.println();
                                    System.out.println("Wrong option!");
                                    System.out.println();

                                }

                            }

                        }

                    }

                    default -> {

                        System.out.println();
                        System.out.println("Invalid option!");
                        System.out.println();

                    }

                }

            } else if (who.equalsIgnoreCase("3")) {

                value = false;

            } else {

                System.out.println();
                System.out.println("You are not allowed to take actions!");
                System.out.println();

            }

        }

        scanner.close();

    }

}
