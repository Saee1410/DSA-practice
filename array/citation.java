public class citation {
    public int Citation(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];
        for(int c : citations){
            if(c >= n){
                buckets[n] ++;

            }else{
                buckets[c]++;
            }
        } 

        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += buckets[i];
            if (total >= i) {
                return i;
            }
        }

        return 0;
      }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        citation c = new citation();
        int hIndex = c.Citation(citations);
        System.out.println("The H-Index is: " + hIndex);
    }
    
}
