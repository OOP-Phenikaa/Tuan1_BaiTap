import java.util.Scanner;
public class Cau6 {
//Viết chương trình in ra các số nguyên tố nằm trong khoảng từ 1 đến n. (chú ý sử dụng
//phương thức kiểm tra số nguyên tố)
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
