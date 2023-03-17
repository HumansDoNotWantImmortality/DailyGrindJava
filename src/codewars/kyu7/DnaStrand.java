package codewars.kyu7;

public class DnaStrand {

    public static String makeComplement(String dna) {

        return dna.replace("A","B")
                .replace("C","D")
                .replace("T","A")
                .replace("G","C")
                .replace("B","T")
                .replace("D","G");
    }
}
