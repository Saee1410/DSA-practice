public class flower {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int count = 0;
        for(int i =0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if(emptyLeft && emptyRight){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        flower f = new flower();
        boolean canPlace = f.canPlaceFlowers(flowerbed, n);
        System.out.println("Can place flowers: " + canPlace);   
    }
    
}
