package Questions;
import java.util.*;

public class _8_GenerateFibonacci {

    static int getNumber(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n <= 1) {
            return n;
        }

        return getNumber(n - 1) + getNumber(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(getNumber(i));
        }
        System.out.println(list);
    }
}
