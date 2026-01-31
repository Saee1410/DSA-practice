public class zero {
    public static void moveZeroes(int num[] ){
           int count = 0;
           for(int i = 0; i < num.length; i++){
                if(num[i] != 0){
                    num[count] = num[i];
                    count++;
                }
           }
              while(count < num.length){
                    num[count] = 0;
                    count++;
              }
    }
    public static void main(String[] args) {
        int num[] = {0, 1, 0, 3, 12};
        moveZeroes(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
    }
 }

}