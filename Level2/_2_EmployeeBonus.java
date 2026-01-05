package Level2;

import java.util.Scanner;

public class _2_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println(0.0);
        }
        sc.close();
    }
}
