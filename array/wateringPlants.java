public class wateringPlants {
    public static int wateringPlants(int[] plants, int capacity){
        int currentCapacity = capacity;
        int steps = 0;
        for(int i =0; i<plants.length; i++){
            if(currentCapacity < plants[i]){
                steps += i * 2;
                currentCapacity = capacity;
            }
            currentCapacity -= plants[i];
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] plants = {2, 4, 5, 1, 2};
        int capacity = 6;
        int result = wateringPlants(plants, capacity);
        System.out.println("Total steps to water all plants: " + result);
    }
    
}
