import java.util.Scanner;
public class Cau13 {
    /*Nhập một xâu ký tự. Liệt kê số lần xuất hiện của các từ bên trong xâu ký tự đó*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một xâu ký tự: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện của từ " + arr[i] + " là: " + count);
        }
    }
}
