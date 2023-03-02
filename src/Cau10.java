import java.util.Scanner;
public class Cau10 {
    /* Tính tổng S(n) = ½ + ¼ + … + 1/2n */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i);
        }
        System.out.println("Tổng S(n) = ½ + ¼ + … + 1/2n là: " + sum);
    }
}
