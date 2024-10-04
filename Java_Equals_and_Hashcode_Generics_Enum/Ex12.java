package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.ArrayList;

public class Ex12 {

    public static void main(String[] args) {

        Pair pair = new Pair(8998, "Galben");
        System.out.println(pair.toString());

    }

}

class Pair {

    private Object object;
    private Object object2;

    public <T, K> Pair(T object, K object2){

        this.object = object;
        this.object2 = object2;

    }

    public Object getObject() {
        return object;
    }

    public Object getObject2() {
        return object2;
    }

    @Override
    public String toString(){

        return "Perechea este: \n"+
                getObject() + " si " + getObject2();

    }

}
