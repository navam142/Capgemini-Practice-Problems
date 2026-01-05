package Level2;

import java.util.Scanner;

public class _7_FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
        sc.close();
    }
}
