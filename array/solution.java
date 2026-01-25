import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // -------- Mean --------
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double mean = sum / n;

        // -------- Median --------
        Arrays.sort(arr);
        double median;
        if (n % 2 == 0) {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            median = arr[n/2];
        }

        // -------- Mode --------
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int mode = arr[0];
        int maxFreq = 0;

        for (int key : freq.keySet()) {
            int f = freq.get(key);

            if (f > maxFreq || (f == maxFreq && key < mode)) {
                maxFreq = f;
                mode = key;
            }
        }

        // -------- Output --------
        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode);
    }
}
