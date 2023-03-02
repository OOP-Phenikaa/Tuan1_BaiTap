import java.util.Scanner;
public class Cau2 {
    //    Viết một phương thức kiểm tra xem một số nguyên có nhiều nhất 5 chữ số phải là số
//Palindrome không ?
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100000) {
            int a = n % 10;
            int b = (n / 10) % 10;
            int c = (n / 100) % 10;
            int d = (n / 1000) % 10;
            int e = (n / 10000) % 10;
            if (a == e && b == d) {
                System.out.println("So " + n + " la so Palindrome");
            } else {
                System.out.println("So " + n + " khong phai la so Palindrome");
            }
        } else {
            System.out.println("So " + n + " khong phai la so Palindrome");
        }
    }
}
