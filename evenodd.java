public class evenodd {
    public static void main(String[] args) {
       int arr[] ={ 2, 3, 4, 6, 8, 9, 7,5,1};
        int evenCounter = 0; 
        int oddCounter = 0;

       for(int i = 0; i < arr.length; i++){
              if(arr[i] % 2 == 0){
                   evenCounter ++;
              } else{
                   oddCounter++;
              }
       }
       System.out.println("Even numbers count : " + evenCounter);
       System.out.println("Odd numbers count: " + oddCounter);
    }
}
