public class subarray {
    public static void findSubarray(int arr[], int s){
        int currentSum = 0;
        int start = 0;

        for(int end=0; end< arr.length; end++){
            currentSum += arr[end];

            while(currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if(currentSum == s){
                System.out.println("Subarray found from index " + start + " to " + end);
                return; 
            }
        }

        System.out.println("no subarray found " + s);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int s = 12;
        findSubarray(arr, s);
    }
}
