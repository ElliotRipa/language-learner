import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {

    public static ArrayList<String> readFile(String filepath) {
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> result = new ArrayList<>();
            while(myReader.hasNextLine()) {
                result.add(myReader.nextLine());
            }
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Word> readLanguage(String filepath) {
        ArrayList<String> result = readFile(filepath);
        ArrayList<String> data = readFile(filepath);
        for (String datum: data){
            System.out.println(datum.split(" "));
        }
        return null;
    }

}
