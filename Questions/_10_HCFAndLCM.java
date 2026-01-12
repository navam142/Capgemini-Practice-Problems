package Questions;

import java.util.Scanner;

public class _10_HCFAndLCM {

    static int getHCF(int n1, int n2) {
        int result = Math.min(n1, n2);
        while (result > 0) {
            if (n1 % result == 0 && n2 % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        int hcf = getHCF(n1, n2);
        System.out.println("hcf: " + hcf);
        System.out.println("lcm: " + n1 * n2 / hcf);
    }
}
