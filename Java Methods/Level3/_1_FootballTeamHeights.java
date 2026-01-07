import java.util.Random;

public class _1_FootballTeamHeights {
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];
        
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + random.nextInt(101); // 150 to 250 inclusive
        }
        
        int sum = findSum(heights);
        double mean = findMean(heights, sum);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println(shortest);
        System.out.println(tallest);
        System.out.println(mean);
    }
    
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }
    
    public static double findMean(int[] arr, int sum) {
        return (double) sum / arr.length;
    }
    
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }
    
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}