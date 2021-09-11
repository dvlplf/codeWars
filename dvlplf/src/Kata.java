import java.util.Arrays;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        int c = a.length;
        for (int i = 0; i < b.length; i++){
            for (int k = 0; k < a.length; k ++) {
                if (b[i] == a[k]) {
                    c--;
                }
            }
        }
        int[] result = new int[c];
        int idResult = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isThis = true;
            for (int k = 0; k < b.length; k++) {
                if (a[i] == b[k]) {
                    isThis = false;
                }
            }
            if (isThis) {
                result[idResult] = a[i];
                idResult++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        arrayDiff(new int [] {1, 2}, new int[] {1});
    }
}
