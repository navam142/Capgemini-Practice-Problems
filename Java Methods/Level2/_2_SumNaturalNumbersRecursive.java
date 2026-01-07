import java.util.*;
public class _2_SumNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            sc.close();
            return;
        }
        sc.close();
        long recursiveSum = sumRecursive(n);
        long formulaSum = sumUsingFormula(n);
        
        System.out.println(recursiveSum);
        System.out.println(formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ.");
        }
    }
    
    public static long sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
    
    public static long sumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}