public class posneg {
    public static void main(String[] args) {

        int arr[] = {12, -7, 5, 3, -1, -9, 8, 0, -4};

        int pos = 0;
        int neg = 0;

        System.out.print("Positive numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
                pos++;
            }
        }

        System.out.println();

        System.out.print("Negative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                neg++;
            }
        }

        System.out.println();
        System.out.println("Total Positive = " + pos);
        System.out.println("Total Negative = " + neg);
    }
}
