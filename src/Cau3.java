import java.util.Scanner;

public class Cau3 {
    //Viết quá tải phương thức cho các số nguyên để kiểm tra một số có phải số nguyên tố không.
    private static boolean isPrime(int n) {
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
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("So " + n + " la so nguyen to");
        } else {
            System.out.println("So " + n + " khong phai la so nguyen to");
        }
    }
}
