import java.util.Arrays;

public class ThreeSumOptimized {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);

        for(int i = 0; i< nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; // Skip duplicates for i

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    System.out.println("Triplet found: " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates for left
                    while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates for right
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }   
            }
        }
    }
    
}
