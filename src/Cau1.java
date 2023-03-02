import java.util.Scanner;
public class Cau1 {
    //    Viết một phương thức trả về tổng n số lẻ đầu tiên. Với n nhập từ bàn phím.
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;
        }
        System.out.println("Tổng " + n + " số lẻ đầu tiên là: " + sum);
    }
}
