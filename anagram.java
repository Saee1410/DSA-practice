import java.util.Arrays;


public class anagram {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        char[] charArray1 = s1.toLowerCase().toCharArray();
        char[] charArray2 = s2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2); 
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args){
        String str1 = "Listen";
        String str2 = "Silent";

        if(isAnagram(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
