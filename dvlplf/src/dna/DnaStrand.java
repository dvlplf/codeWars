package dna;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] result = dna.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] = getComplement(result[i]);
        }
        return new String(result);
    }

    private static char getComplement(char c) {
        switch (c){
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }
}
