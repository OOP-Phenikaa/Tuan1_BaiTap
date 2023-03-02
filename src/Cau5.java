import java.util.Scanner;
public class Cau5 {
//    Tìm ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên nhập từ bàn phím.
//(Xây dựng hai phương thức tìm ước số chung và bội số chung khác nhau).
    private static int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    private static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        System.out.println("Nhap a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        System.out.println("UCLN cua " + a + " va " + b + " la: " + UCLN(a, b));
        System.out.println("BCNN cua " + a + " va " + b + " la: " + BCNN(a, b));
    }
}
