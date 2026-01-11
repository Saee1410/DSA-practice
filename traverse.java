public class traverse{

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8,10};
        int sum = 0;
        int count = 0;

        for(int i=0; i< num.length; i++){
            // System.out.print(num[i]);

            //sum
            sum += num[i];
           // System.out.println("sum is :" + sum);

            if(num[i] % 2 == 0){
                count++;
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
        System.out.println("Count of even number:" + count);

    }
}