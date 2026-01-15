public class day1 {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
            // Move start forward until we find a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            // Move end backward until we find a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(word);
    }

    public static void main(String[] args) {
        day1 solution = new day1();
        String input = "hello";
        System.out.println(solution.reverseVowels(input)); // Output: "holle"
    }
}

    

