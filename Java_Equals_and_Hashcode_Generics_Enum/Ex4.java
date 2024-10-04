package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.Objects;

public class Ex4 {

    public static void main(String[] args) {

        Song song = new Song("Nuttin but a G Thang", "Dr. Dre", 3);
        Song song1 = new Song("Nuttin but a G Thang", "Dr. Dre", 3);

        System.out.println(song.equals(song1));
        System.out.println(song.hashCode());
        System.out.println(song1.hashCode());

    }

}

class Song {

    private String title;
    private String artist;
    private int length;

    public Song (String title, String artist, int length){

        this.title = title;
        this.artist = artist;
        this.length = length;

    }

    @Override
    public boolean equals(Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Song)){

            return false;

        }

        Song song = (Song) o;

        return Objects.equals(this.title, song.title) && Objects.equals(this.artist, song.artist);
    }

    @Override
    public int hashCode(){

        return Objects.hash(title, artist);

    }

}
