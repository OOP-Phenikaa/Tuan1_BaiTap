import java.util.Scanner;
public class Cau14 {
    /*Nhập 2 xâu ký tự s1 và s2. Viết hàm kiểm tra xem xâu ký tự s1 có chứa xâu ký tự s2 hay
    không ?*/
    public static boolean isContain(String s1, String s2) {
        if (s1.contains(s2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập xâu ký tự s1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập xâu ký tự s2: ");
        String s2 = sc.nextLine();
        if (isContain(s1, s2)) {
            System.out.println("Xâu ký tự s1 chứa xâu ký tự s2");
        } else {
            System.out.println("Xâu ký tự s1 không chứa xâu ký tự s2");
        }
    }
}
