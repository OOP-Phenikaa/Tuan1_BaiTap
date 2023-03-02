import java.util.Scanner;
public class Cau4 {
    //    Viết phương với đầu vào là một số nguyên có 4 chữ số, sau đó trả về là một chuỗi dạng chữ
//của số nguyên. Ví dụ: 9345 = Chín nghìn ba trăm bốn mươi lăm.
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = (n / 1000) % 10;
        String[] arr = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        System.out.println("Chuoi cua so " + n + " la: " + arr[d] + " nghin " + arr[c] + " tram " + arr[b] + " muoi " + arr[a]);
    }
}
