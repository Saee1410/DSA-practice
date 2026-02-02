public class count {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        // 1. String la lowercase kara mhanje 'A' ani 'a' madhe farak rahanar nahi
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 2. Pahile to character alphabet (a-z) aahe ka te check kara
            if (ch >= 'a' && ch <= 'z') {
                
                // 3. Jar to vowel asel tar vowels++ kara
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
                // 4. Nahi tar to consonant aahe
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World 123!";
        countVowelsAndConsonants(input);
    }
}
