package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.Objects;

public class Ex5 {

    public static void main(String[] args) {

        Product product = new Product("Nutella", 15, 999);
        Product product1 = new Product("Nutella", 15, 999);
        Product product2 = new Product("Nutella", 15, 998);

        System.out.println(product.equals(product1));
        System.out.println(product.equals(product2));

        System.out.println(product.hashCode());
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

    }

}

class Product{

    private String name;
    private int price;
    private int id;

    public Product (String name, int price, int id){

        this.name = name;
        this.price = price;
        this.id = id;

    }

    public boolean equals(Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Product)){

            return false;

        }

        Product product = (Product) o;

        return this.id == product.id;

    }

    @Override
    public int hashCode(){

        return Objects.hash(id);

    }

}