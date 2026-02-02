public class PalindromeString {
    public static boolean isPalindrome(String str) {
        // Jar string rikmi asel tar ti palindrome asu shakate
        if (str == null || str.length() == 0) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Check kara ki donhi pointers varche characters sarakhe aahet ka
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Jar ek जरी mismatch bhetla tar to palindrome nahi
            }
            
            start++; // Davun pudhe sarka
            end--;   // Ujvi kadun mage sarka
        }

        return true; // Jar pura loop sampla ani mismatch bhetla nahi tar to palindrome aahe
    }

    public static void main(String[] args) {
        String word = "racecar";
        
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}