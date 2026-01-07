public class _5_NumberChecker {
    public static void main(String[] args) {
        int number = 9;
        
        System.out.println(isPrime(number));
        System.out.println(isNeon(number));
        System.out.println(isSpy(number));
        System.out.println(isAutomorphic(number));
        System.out.println(isBuzz(number));
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    
    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }
    
    public static boolean isAutomorphic(int n) {
        long square = (long) n * n;
        return square % Math.pow(10, String.valueOf(n).length()) == n;
    }
    
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}