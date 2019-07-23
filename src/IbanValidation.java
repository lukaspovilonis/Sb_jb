import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

class IbanValidation {

    //patikrina Iban kodo pirmus du simbolius pagal kurius nustato kokio ilgio turi būti Iban kodas tada patikrina
    //kokio ilgio turi buti Iban kodas su gautu ir jai jie nesutampa siunčiamas kad kodas yra blogas
    // yra atskiremi keturi simboliai tarp kuriu yra žinoma, jog turi būti raidžių ir siunčiamia jas pakeisti į skaičius
    //tikriname ar likęs Iban kodas neturi raidžių nusiiūsdami į changeLettersToNumbers(String s);, gautus skaitmenis sudedame
    //pagal taisykles ir tikriname gauta koda pagal mod 97 taisyklę.
    static boolean validateIban(String iban){
        BigInteger bi = new BigInteger("2");
        iban = iban.trim();
        if (iban.length()>=2) {
            iban = iban.toUpperCase();
            String twoLetters = iban.substring(0, 2);
            if(Maps.contryIban().containsKey(twoLetters)) {

                if (iban.length() == Integer.parseInt(Maps.contryIban().get(twoLetters).toString())) {
                    String fourLetters = iban.substring(0, 4);
                    String restIban = iban.substring(4, iban.length());
                    restIban = changeLettersToNumbers(restIban);

                    restIban += changeLettersToNumbers(fourLetters);


                    restIban = restIban.trim();
                    bi = new BigInteger(restIban);
                    bi = bi.mod(new BigInteger("97"));
                }
            }
        }
        return bi.equals(new BigInteger("1"));
    }

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
                writer.write(s + ";" + validateIban(s)+ System.lineSeparator());
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

    //tikrina ar yra eilutėje raidžių ir keičia jas pagal taisykles į atitinkančius skaičius.
    private static String changeLettersToNumbers(String s){
        HashMap lettersToNumbers = Maps.hashMap();
        String s2 = "";
        char c;
        if (s.matches("^[a-zA-Z0-9]*$")) {
            for (int i = 0; i < s.length(); i++){
                c= s.charAt(i);
                if(Character.isLetter(c)){
                    s2 += lettersToNumbers.get(String.valueOf(c));
                }else {
                    s2 += c;
                }
            }
        }else s2 = s;
        return s2;
    }
}
