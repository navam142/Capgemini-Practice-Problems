public class _6_NumberChecker {
    public static void main(String[] args) {
        int number = 28;
        
        int[] factors = findFactors(number);
        int greatest = findGreatestFactor(factors);
        long sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        long cubeProduct = productOfCubes(factors);
        
        System.out.println(greatest);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(cubeProduct);
        System.out.println(isPerfect(number, sum));
        System.out.println(isAbundant(number, sum));
        System.out.println(isDeficient(number, sum));
        System.out.println(isStrong(number));
    }
    
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[idx++] = i;
        }
        return factors;
    }
    
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    
    public static long productOfFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }
    
    public static long productOfCubes(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }
    
    public static boolean isPerfect(int n, long sum) {
        return sum - n == n; // proper divisors sum excludes n
    }
    
    public static boolean isAbundant(int n, long sum) {
        return sum - n > n;
    }
    
    public static boolean isDeficient(int n, long sum) {
        return sum - n < n;
    }
    
    public static boolean isStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            long fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        return sum == original;
    }
}