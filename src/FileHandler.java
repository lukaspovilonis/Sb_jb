import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    //tikrina failą ir siuncia jas apdoroti validateIban funkcijai ir raso į išeities failą.
    static boolean fileCheck(File file) throws IOException {
        boolean b  = false;
        Scanner sc = null;
        if(file.isFile()) {
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        File write = new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().length()-4)+".out.");
        if(write.exists()){
            write.delete();
        }
        try {
            write.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter writer = new FileWriter(write);
        String s;
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            try {
                writer.write(s + ";" + IbanValidation.validateIban(s)+ System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
            b = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }
}
