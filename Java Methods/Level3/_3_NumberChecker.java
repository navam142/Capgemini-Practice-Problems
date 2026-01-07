public class _3_NumberChecker {
    public static void main(String[] args) {
        int number = 21;
        
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);
        
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        
        System.out.println(sum);
        System.out.println(sumSquares);
        System.out.println(isHarshadNumber(number, sum));
        
        int[][] frequency = findDigitFrequency(digits);
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println(row[0] + " " + row[1]);
            }
        }
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
    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    
    public static boolean isHarshadNumber(int number, int sum) {
        return number % sum == 0;
    }
    
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
}