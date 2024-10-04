package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.Objects;

public class Ex3 {

    public static void main(String[] args) {

        Student student = new Student("Sebi", 23, 9, "sebastian.mutulerscu9@gmail.com");
        Student student1 = new Student("Sebi", 23, 9, "sebastian.mutulerscu9@gmail.com");

        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

    }

}

class Student {

    private String name;
    private int age;
    private int id;
    private String email;

    public Student (String name, int age, int id, String email){

        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;

    }

    @Override
    public boolean equals (Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Student)){

            return false;

        }

        Student student = (Student) o;

        return this.age==student.age && Objects.equals(this.name, student.name) && Objects.equals(this.email, student.email);

    }

    public int hashCode(){

        return Objects.hash(age, name, email);

    }

}
