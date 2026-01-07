public class _7_OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        boolean unique = areAllUnique(otps);
        System.out.println(unique);
    }
    
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    
    public static boolean areAllUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }
}