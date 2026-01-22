//Brute Force Approach for Two Sum Problem time complextiy (O(n^2))

public class TwoSum {
    public int[] twoSumBruteForce(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        TwoSum ts = new TwoSum();
        int result[] = ts.twoSumBruteForce(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
