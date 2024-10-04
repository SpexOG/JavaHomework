package Java_Equals_and_Hashcode_Generics_Enum;

import java.time.LocalDateTime;

public class Ex6 {

    public static void main(String[] args) {

        System.out.println("La culaorea " + LightColor.RED + " se actioneaza prin " + LightColor.RED.getRepresentation() + ", iar durata acestei culori de la semafor este de: " + LightColor.RED.getDuration() + " secunde.");
        System.out.println("La culaorea " + LightColor.YELLOW + " se actioneaza prin " + LightColor.YELLOW.getRepresentation() + ", iar durata acestei culori de la semafor este de: " + LightColor.YELLOW.getDuration() + " secunde.");
        System.out.println("La culaorea " + LightColor.GREEN + " se actioneaza prin " + LightColor.GREEN.getRepresentation() + ", iar durata acestei culori de la semafor este de: " + LightColor.GREEN.getDuration() + " secunde.");

    }

}

enum LightColor {

    RED ("Stop", 30),

    YELLOW ("Caution", 5),

    GREEN ("Go", 45);

    private final String representation;
    private final int duration;

    public String getRepresentation() {
        return representation;
    }

    public int getDuration() {
        return duration;
    }

    LightColor (String representation, int duration){

        this.representation = representation;
        this.duration = duration;

    }



}
