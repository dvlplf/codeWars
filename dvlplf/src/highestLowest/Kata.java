package highestLowest;

import java.sql.Array;
import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        StringBuilder res = new StringBuilder("");
        res.append(nums[nums.length - 1]).append(" ").append(nums[0]);
        return res.toString();
    }

    public static void main(String[] args) {
        highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    }
}
