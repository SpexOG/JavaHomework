package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.Objects;

public class Ex1 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(15,20);
        Rectangle rectangle1 = new Rectangle(15,20);

        System.out.println(rectangle.equals(rectangle1));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle1.hashCode());

    }

}

class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height){

        this.width = width;
        this.height = height;

    }

    @Override
    public boolean equals(Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Rectangle)){

            return false;

        }

        Rectangle rectangle = (Rectangle) o;

        return rectangle.width == this.width && rectangle.height == this.height;

    }

    @Override
    public int hashCode(){

        return Objects.hash(width, height);

    }



}