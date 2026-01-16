import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // duplicate i skip
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            twoSumII(nums, i, res);
        }
        return res;
    }

    private void twoSumII(int[] nums, int i, List<List<Integer>> res) {

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                left++;
                right--;

                // duplicate left skip
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }

                // duplicate right skip
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
         ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum.threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
