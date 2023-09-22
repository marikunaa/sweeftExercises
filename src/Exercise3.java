import java.util.Arrays;

public class Exercise3 {

    public int notContains(int[] array) {
        // to sort input in an ascending order
        Arrays.sort(array);
        int smallestPositive = 1;
        for (int num : array) {
            // if the current number is smaller than or equal to the current smallestPositive,
            // update smallestPositive to the next integer
            if (num <= smallestPositive && num > 0) {
                smallestPositive = num + 1;
            }
        }
        return smallestPositive;
    }

}
