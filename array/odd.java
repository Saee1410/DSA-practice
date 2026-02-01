public class odd {
    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 66, 78};
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] %2 != 0){
                System.out.println(arr[i]);
            }
        }
        System.err.println("odd numbers printed");
    }
    
}
