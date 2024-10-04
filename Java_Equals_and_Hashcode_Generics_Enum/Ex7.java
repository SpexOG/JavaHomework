package Java_Equals_and_Hashcode_Generics_Enum;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex7 {

    public static <T> void main(String[] args) {

        List<Object>list=new ArrayList<>();
        list.add(new Entities(456, "Ion", 5));
        list.add(new Entities(456, "John", 15));
        list.add(new Entities(999, "Sebi", 59));

        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        System.out.println(list.get(2).toString());

        System.out.println(list.get(0).equals(list.get(1)));
        System.out.println(list.get(1).equals(list.get(2)));

        System.out.println("Hashcode-ul id-ului primei liste este " + list.get(0).hashCode());
        System.out.println("Hashcode-ul id-ului primei liste este " + list.get(1).hashCode());
        System.out.println("Hashcode-ul id-ului primei liste este " + list.get(2).hashCode());


    }

}

class Entities{

    private int id;
    private String name;
    private int timestamp;

    public Entities(int id, String name, int timestamp){

        this.id=id;
        this.name=name;
        this.timestamp=timestamp;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Entities)){

            return false;

        }

        Entities entities = (Entities) o;

        return this.id == entities.id;

    }

    @Override
    public int hashCode(){

        return Objects.hash(this.id);

    }

    @Override
    public String toString(){

        return "Entitate: " + "id = " + this.id + ", name = " + this.name + ", timestamp = " + timestamp + ".";

    }

}
