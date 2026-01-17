public class elimination {
    public int lastRemaining(int n) {
        int step =1;
        int head =1;
        int remaining = n;
        boolean left = true;

        while(remaining > 1){
            if(left || remaining % 2 == 1){
                head = head + step;
            }
            remaining = remaining / 2;
            step = step * 2;
            left = !left;
        }
        return head;

    }
    public static void main(String[] args) {
         int n = 9;
        elimination e = new elimination();
        int result = e.lastRemaining(n);

        System.out.println("Last remaining number: " + result);
        
    }
}
