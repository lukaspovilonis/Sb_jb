import java.util.HashMap;

class Maps {
    //saugo raidžių atitikimą skaitmenim
    static HashMap hashMap(){

        HashMap<String, String>letersToNumbers = new HashMap<>();
        letersToNumbers.put("A", "10");
        letersToNumbers.put("B", "11");
        letersToNumbers.put("C", "12");
        letersToNumbers.put("D", "13");
        letersToNumbers.put("E", "14");
        letersToNumbers.put("F", "15");
        letersToNumbers.put("G", "16");
        letersToNumbers.put("H", "17");
        letersToNumbers.put("I", "18");
        letersToNumbers.put("J", "19");
        letersToNumbers.put("K", "20");
        letersToNumbers.put("L", "21");
        letersToNumbers.put("M", "22");
        letersToNumbers.put("N", "23");
        letersToNumbers.put("O", "24");
        letersToNumbers.put("P", "25");
        letersToNumbers.put("Q", "26");
        letersToNumbers.put("R", "27");
        letersToNumbers.put("S", "28");
        letersToNumbers.put("T", "29");
        letersToNumbers.put("U", "30");
        letersToNumbers.put("V", "31");
        letersToNumbers.put("W", "32");
        letersToNumbers.put("X", "33");
        letersToNumbers.put("Y", "34");
        letersToNumbers.put("Z", "35");

        return letersToNumbers;
    }

    //saugo Iban šalių kodų ilgius (šalis nustatoma pagal 2 Iban simbolius)
    static HashMap contryIban(){

        HashMap<String, Integer> ibanLenght = new HashMap<>();

        ibanLenght.put("AL", 28);
        ibanLenght.put("DZ", 24);
        ibanLenght.put("AD", 24);
        ibanLenght.put("AO", 25);
        ibanLenght.put("AT", 20);
        ibanLenght.put("AZ", 28);
        ibanLenght.put("BH", 22);
        ibanLenght.put("BY", 28);
        ibanLenght.put("BE", 16);
        ibanLenght.put("BJ", 28);
        ibanLenght.put("BA", 20);
        ibanLenght.put("BR", 29);
        ibanLenght.put("VG", 24);
        ibanLenght.put("BG", 22);
        ibanLenght.put("BF", 27);
        ibanLenght.put("BI", 16);
        ibanLenght.put("CM", 27);
        ibanLenght.put("CV", 25);
        ibanLenght.put("CG", 27);
        ibanLenght.put("CR", 21);
        ibanLenght.put("HR", 21);
        ibanLenght.put("CY", 28);
        ibanLenght.put("CZ", 24);
        ibanLenght.put("DK", 18);
        ibanLenght.put("DO", 28);
        ibanLenght.put("EG", 27);
        ibanLenght.put("EE", 20);
        ibanLenght.put("FO", 18);
        ibanLenght.put("FI", 18);
        ibanLenght.put("FR", 27);
        ibanLenght.put("GA", 27);
        ibanLenght.put("GE", 22);
        ibanLenght.put("GI", 23);
        ibanLenght.put("GR", 27);
        ibanLenght.put("GL", 18);
        ibanLenght.put("GT", 28);
        ibanLenght.put("GG", 22);
        ibanLenght.put("HU", 28);
        ibanLenght.put("IS", 26);
        ibanLenght.put("IR", 26);
        ibanLenght.put("IQ", 23);
        ibanLenght.put("IE", 22);
        ibanLenght.put("IM", 22);
        ibanLenght.put("IL", 23);
        ibanLenght.put("IT", 27);
        ibanLenght.put("CI", 28);
        ibanLenght.put("JE", 22);
        ibanLenght.put("JO", 30);
        ibanLenght.put("KZ", 20);
        ibanLenght.put("XK", 20);
        ibanLenght.put("KW", 30);
        ibanLenght.put("LV", 21);
        ibanLenght.put("LB", 28);
        ibanLenght.put("LI", 21);
        ibanLenght.put("LU", 20);
        ibanLenght.put("MK", 19);
        ibanLenght.put("MG", 27);
        ibanLenght.put("ML", 28);
        ibanLenght.put("MT", 31);
        ibanLenght.put("MR", 27);
        ibanLenght.put("MU", 30);
        ibanLenght.put("MD", 24);
        ibanLenght.put("MC", 27);
        ibanLenght.put("ME", 22);
        ibanLenght.put("MZ", 25);
        ibanLenght.put("NL", 18);
        ibanLenght.put("NO", 15);
        ibanLenght.put("PK", 24);
        ibanLenght.put("PS", 29);
        ibanLenght.put("PL", 28);
        ibanLenght.put("PT", 25);
        ibanLenght.put("QA", 29);
        ibanLenght.put("RO", 24);
        ibanLenght.put("LC", 32);
        ibanLenght.put("SM", 27);
        ibanLenght.put("ST", 25);
        ibanLenght.put("SA", 24);
        ibanLenght.put("SN", 28);
        ibanLenght.put("RS", 22);
        ibanLenght.put("SC", 31);
        ibanLenght.put("SK", 24);
        ibanLenght.put("SI", 19);
        ibanLenght.put("ES", 24);
        ibanLenght.put("SE", 24);
        ibanLenght.put("CH", 21);
        ibanLenght.put("TL", 23);
        ibanLenght.put("TN", 24);
        ibanLenght.put("TR", 26);
        ibanLenght.put("UA", 29);
        ibanLenght.put("AE", 23);
        ibanLenght.put("GB", 22);
        ibanLenght.put("VA", 22);
        ibanLenght.put("LT", 20);
        ibanLenght.put("DE", 22);

        return ibanLenght;
    }

}
