package exercism;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> codons = extractCodons(rnaSequence);
        return translateCodons(codons);
    }

    private List<String> extractCodons(String rnaSequence) {
        List<String> codons = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            int endIndex = Math.min(i + 3, rnaSequence.length());
            codons.add(rnaSequence.substring(i, endIndex));
        }

        return codons;
    }

    private List<String> translateCodons(List<String> codons) {
        List<String> translations = new ArrayList<>();

        for (String codon : codons) {
            String translation = switch (codon) {
                case "AUG" -> "Methionine";
                case "UUU", "UUC" -> "Phenylalanine";
                case "UUA", "UUG" -> "Leucine";
                case "UCU", "UCC", "UCA", "UCG" -> "Serine";
                case "UAU", "UAC" -> "Tyrosine";
                case "UGU", "UGC" -> "Cysteine";
                case "UGG" -> "Tryptophan";
                case "UAA", "UAG", "UGA" -> "STOP";
                default -> throw new IllegalArgumentException("Wrong codon");
            };

            if (translation.equals("STOP")) {
                return translations;
            }

            translations.add(translation);
        }

        return translations;
    }
}
