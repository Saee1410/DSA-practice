public class sortedarr {
    public static boolean isSorted(int arr[]){
        for(int i =0; i< arr.length; i++){
            if(i < arr.length -1 && arr[i] >  arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = isSorted(arr);
        if(result){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    
}
