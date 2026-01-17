public class majorityele {
    public int majorityElement(int[] nums){
        int count = 0;
        Integer candidate = null;
        for(int num : nums){
            if(count == 0){
                candidate = num;
                count = 1;
            }else if(num == candidate){
                count ++;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5,6,4,4,5,5,5,5,5,};
        majorityele m = new majorityele();
        int majority = m.majorityElement(nums);     
        System.out.println("The majority element is: " + majority);
    }
    
}
