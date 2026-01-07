public class _4_NumberChecker {
    public static void main(String[] args) {
        int number = 121;
        
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);
        int[] reversed = reverseDigits(digits);
        
        System.out.println(isPalindrome(digits, reversed));
        System.out.println(isDuckNumber(digits));
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
    
    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }
    
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits, int[] reversed) {
        return arraysEqual(digits, reversed);
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }
}