public class _2_NumberChecker {
    public static void main(String[] args) {
        int number = 153; // Example number
        
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);
        
        System.out.println(digitCount);
        System.out.println(isDuckNumber(digits));
        System.out.println(isArmstrongNumber(digits, digitCount));
        
        int largest = findLargest(digits);
        int secondLargest = findSecondLargest(digits);
        System.out.println(largest);
        System.out.println(secondLargest);
        
        int smallest = findSmallest(digits);
        int secondSmallest = findSecondSmallest(digits);
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
    
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    
    public static int[] storeDigits(int n, int count) {
        int[] digits = new int[count];
        int temp = Math.abs(n);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(int[] digits, int count) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, count);
        }
        int original = 0;
        for (int d : digits) original = original * 10 + d;
        return sum == original;
    }
    
    public static int findLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        for (int d : digits) if (d > max) max = d;
        return max;
    }
    
    public static int findSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return second;
    }
    
    public static int findSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        for (int d : digits) if (d < min) min = d;
        return min;
    }
    
    public static int findSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return second;
    }
}