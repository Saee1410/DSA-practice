public class smallele {
    public static void main(String[] args) {
        int arr[] = {5, 3,8,1,4};
        int smallele = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]< smallele){
                smallele = arr[i];
              
            }
        }
        System.out.println("smallest element is: " + smallele);
    }
    
}
