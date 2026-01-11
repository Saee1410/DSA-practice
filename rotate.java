public class rotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5};
        int k = 2;

        k = k % arr.length; // In case k is greater than array length

        // Rotate the array
       for(int i=0; i < arr.length; i++){
           System.out.print(arr[i] + "");
       }
       for(int i =0; i< k; i++){
        System.out.print(arr[i] + "");
       }
    }
}
