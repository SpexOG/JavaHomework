package Java_Equals_and_Hashcode_Generics_Enum;

public class Ex16 {

    public static void main(String[] args) {

        for (CarType carType : CarType.values()){

            System.out.println(carType);

        }

    }

}

enum CarType{

    Sport ("Nissan", 200000),
    SUV ("BMW", 100000),
    Sedan("Dacia", 20000);

    private String manufacture;
    private int price;
    CarType(String manufacture, int price){

        this.manufacture=manufacture;
        this.price=price;

    }

    @Override
    public String toString(){

        return "Car type: " + this.name() + " manufacture: " + manufacture + " average price: " + price;

    }

}