import java.util.Scanner;

public class _1_FactorsCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        sc.close();
        
        int[] factors = findFactors(number);
        
        // Display factors
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) System.out.print(" ");
        }
        System.out.println();
        
        long sum = sumOfFactors(factors);
        long sumOfSquares = sumOfSquaresOfFactors(factors);
        long product = productOfFactors(factors);
        
        System.out.println(sum);
        System.out.println(sumOfSquares);
        System.out.println(product);
    }
    
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    
    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    
    public static long sumOfSquaresOfFactors(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }
    
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }
}