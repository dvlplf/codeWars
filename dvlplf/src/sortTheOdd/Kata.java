package sortTheOdd;

public class Kata {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                int min = array[i];
                int minId = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % 2 != 0) {
                        if (array[j] < min) {
                            min = array[j];
                            minId = j;
                        }
                    }
                }
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }
        }
        return array;
    }
}
