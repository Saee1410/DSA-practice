public class minmax {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 10, 60};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
            System.out.println("Min element = " + min);
            System.out.println("Max element = " + max);
    }
 }

