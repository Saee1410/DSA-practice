public class evenCount {
    public static void main(String[] args) {
        int[] arr= {2, 4, 6, 8,10};
        int evenCount = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2==0){
                evenCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);

    }
}
