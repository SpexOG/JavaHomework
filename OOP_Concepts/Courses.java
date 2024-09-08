package OOP_Concepts;

public class Courses {

    //Atribute
    String name, schedule, duration, description;
    Proffesors assignedProffesor;

    //Constructor
    public Courses(String name, String schedule, String duration, String description, Proffesors assignedProffesor){

        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProffesor = assignedProffesor;

    }

    //Metoda
    public void courseDetails(){

        System.out.println("Nume materie: " + name);
        System.out.println("Program: " + schedule);
        System.out.println("Durata: " + duration);
        System.out.println("Descriere: " + description);
        System.out.println("Profesor: " + assignedProffesor.firstName + " " + assignedProffesor.lastName);

    }

}
