package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex8 {

    public static void main(String[] args) {


        Obj obj = new Obj(99, "Ceva");
        Obj obj1 = new Obj(98, "Ceva1");
        Obj obj2 = new Obj(59, "Ceva2");
        Obj obj3 = new Obj(99, "Ceva nice");

        Map<Object, Object> map = new HashMap<>();
        map.put(obj.getId(), obj.getData());
        map.put(obj1.getId(), obj1.getData());
        map.put(obj2.getId(), obj2.getData());
        map.put(obj3.getId(), obj3.getData());

        for (Object id : map.keySet()){

            Object str = map.get(id);
            System.out.println(id + " este id-ul pentru obiectul: " + str);

        }

    }

}

class Obj {

    private int id;
    private String data;

    public Obj(int id, String data){

        this.id = id;
        this.data =data;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o){

        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof Obj))
            return false;
        Obj obj = (Obj) o;
        return this.id== obj.id;

    }

    @Override
    public int hashCode(){

        return Objects.hash(this.id);

    }

    @Override
    public String toString(){

        return "Object: id = " + this.id + ", data: " + this.data + ".";

    }

}
