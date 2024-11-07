package Java_Exceptions.FileCopyUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopyUtility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source path: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter the destination path: ");
        String destinationPath = scanner.nextLine();

        //String sourcePath="D:\\Programare\\Java\\Teme Java\\Java\\src\\Java_Exceptions\\FileCopyUtility\\source\\doccument.txt";
        //String destinationPath="D:\\Programare\\Java\\Teme Java\\Java\\src\\Java_Exceptions\\FileCopyUtility\\destination\\doccument.txt";

        try {
            copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfully");
        }catch (FileNotFoundException e){
            System.out.println("Error: Source file not found: " + e.getMessage());
        }catch (IOException exc){
            System.out.println("Error: An I/O error occurred: " + exc.getMessage());
        }finally {
            scanner.close();
        }

    }

    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException, IOException{

        Path source = Path.of(sourcePath);
        Path destination = Path.of(destinationPath);

        if (!Files.exists(source)){

            throw new FileNotFoundException("The source file does not exist!");

        }

        try {

            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException ex){

            System.out.println(ex.getMessage());

        }

    }

}
