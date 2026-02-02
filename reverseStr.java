public class reverseStr {
    public static String rverse(String str){
        char[] s = str.toCharArray();

        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;  
        }
            return new String(s);
    }
    public static void main(String[] args) {
        String original = "hello";
        String reversed = rverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
    
}
