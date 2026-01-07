import java.util.Scanner;

public class _4_StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            values[index++] = num;
        }
        for (int i = 0; i < index; i++) {
            total += values[i];
            System.out.println(values[i]);
        }
        System.out.println(total);
        sc.close();
    }
}