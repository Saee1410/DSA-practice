public class missing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9,10};
        int n = arr.length + 1; // Since one number is missing
        int tatalSum = n * (n + 1)/2;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        int missingNumber = tatalSum - sum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
