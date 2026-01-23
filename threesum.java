public class threesum {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 0, 1, -1, 2, -2};
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        // Print loop chya aat pahije
                        System.out.println("Triplet found: " + nums[i] + ", " + nums[j] + ", " + nums[k]);
                    }
                }
            }
        }
    }
}