public class DnaStrand {
    public static String makeComplement(String dna) {
        String result = "";
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A':
                    result += "T";
                    break;
                case 'T':
                    result += "A";
                    break;
                case 'C':
                    result += "G";
                    break;
                case 'G':
                    result += "C";
                    break;
            }
        }
        return result;
    }
}
