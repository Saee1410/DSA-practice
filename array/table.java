public class table {
   
    public static void main(String[] args) {
        int num = 5; // ज्या अंकाचा पाढा हवा आहे तो
        
        System.out.println(num + " चा पाढा:");
        for (int i = 1; i <= 10; i++) {
            // printf वापरून आपण टेबल फॉरमॅटमध्ये प्रिंट करू शकतो
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

