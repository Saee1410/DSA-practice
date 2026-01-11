public class dsa1 {
    public static void main(String[] args) {
          int arr[] = {64, 25, 12, 22, 11};
          int min = arr[0];
          int max = arr[0];


            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
            }
             System.out.println("The minimum value in the array is: " + min);
                System.out.println("The maximum value in the array is: " + max);
    }
           
}