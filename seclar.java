public class seclar{
    public static int getSecondLargest(int arr[]) {
        // Jar array madhe 2 peksha kami elements astil tar second largest asu shakat nahi
        if (arr.length < 2) {
            return -1; 
        }

        int max = Integer.MIN_VALUE;       // Saglyat lahan shakya value
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Case 1: Jar current element max peksha motha asel
            if (arr[i] > max) {
                secondMax = max; // June max aata secondMax jhale
                max = arr[i];    // Navin max bhetla
            } 
            // Case 2: Jar element max peksha lahan aahe pan secondMax peksha motha aahe
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int result = getSecondLargest(arr);
        
        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest element bhetla nahi.");
        } else {
            System.out.println("The second largest element is: " + result);
        }
    }
}