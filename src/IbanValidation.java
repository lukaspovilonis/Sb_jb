import java.math.BigInteger;
import java.util.stream.Stream;

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
            StringBuilder ibanConvertedToNumbers = new StringBuilder();
            String twoLetters = iban.substring(0, 2);
            if(Maps.contryIBANLenght().containsKey(iban.substring(0, 2)) && iban.length() == Integer.parseInt(Maps.contryIBANLenght().get(twoLetters).toString())) {
                String restIban = iban.substring(4);
                ibanConvertedToNumbers.append(restIban.matches("^[a-zA-Z0-9]*$")?changeLettersToNumbers(restIban.chars().mapToObj(c->(char)c)):restIban);
                ibanConvertedToNumbers.append(changeLettersToNumbers(iban.substring(0,4).chars().mapToObj(c->(char)c)));
                bi = new BigInteger(ibanConvertedToNumbers.toString().trim());
            }
        }
        return bi.mod(new BigInteger("97")).equals(new BigInteger("1"));
    }

    //tikrina ar yra eilutėje raidžių ir keičia jas pagal taisykles į atitinkančius skaičius.
    private static String changeLettersToNumbers(Stream<Character> lettersStream){
        StringBuilder stringBuilder = new StringBuilder();
        lettersStream.forEach(c -> stringBuilder.append(Character.isLetter(c)?Character.getNumericValue(c):c.toString()));
        return stringBuilder.toString();
    }
}
