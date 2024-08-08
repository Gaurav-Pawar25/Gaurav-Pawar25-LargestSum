import java.util.List;
import java.util.Collections;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {


        // Sort the list in descending order
        Collections.sort(nums, Collections.reverseOrder());

        // Take the first element as the largest
        int first = nums.get(0);
        int second = Integer.MIN_VALUE;

        // Find the second largest value, allowing for duplicates
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != first || (i > 0 && nums.get(i) == first)) {
                second = nums.get(i);
                break;
            }
        }

        // If no distinct or valid second value is found, second will still be the first
        if (second == Integer.MIN_VALUE) {
            second = first;
        }

        return first + second;
    }
}
