import java.util.Scanner;
public class Cau12 {
    /*Nhập một xâu ký tự. Đếm số từ của xâu đó (mỗi từ cách nhau bởi một khoảng trắng có thể
là một hoặc nhiều dấu cách, tab, xuống dòng). Ví dụ " Hoc java tu co ban den nang cao " có 8 từ.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một xâu ký tự: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Số từ của xâu ký tự là: " + (count + 1));
    }
}
