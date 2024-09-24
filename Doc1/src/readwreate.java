import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class readwreate {
    public static void main(String[] args) {
        String a= "je suis un etudiant";
        // write to file in assets folder
        try {
            File myObj = new File("assets/test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // read from file in assets folder
        try {
            File myObj = new File("assets/test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}