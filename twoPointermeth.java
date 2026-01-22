import java.util.Arrays;

public class twoPointermeth {
    public int[] twoSunTwoPointers(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right= nums.length-1;

        while(left< right){
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[] {left, right};
            }else if(sum < target) {
                left++;
            }else{
                right--;
            }
        }
       return new int [] {};
    }
    public static void main(String[] args){
        int nums[] = {1, 3, 2,6, 4};
        int target = 5;
        twoPointermeth pm = new twoPointermeth();
         int result[] = pm.twoSunTwoPointers(nums, target);
         if(result.length == 2){
              System.out.println("Indices: " + result[0] + ", " + result[1]);
         }
            else{
                System.out.println("No two sum solution found");
            }

    }
    
}
