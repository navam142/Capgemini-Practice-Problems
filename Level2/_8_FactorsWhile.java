package Level2;

import java.util.Scanner;

public class _8_FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int i = 1;
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
        sc.close();
    }
}
