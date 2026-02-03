public class comparison {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i = 0; i< str.length();  i++){
            if(i + 1< str.length() && str.charAt(i) == str.charAt(i + 1)){
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    public static void main(String[] args) {
        String input = "aaabbc";
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compress(input));
    }
}
