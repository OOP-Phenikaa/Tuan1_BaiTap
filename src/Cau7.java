import java.util.Scanner;

public class Cau7 {
    /*Nhập 1 dãy số nguyên có giá trị lớn hơn 0, kết thúc việc nhập dãy số nguyên đó bằng số 0.
Sau đó:
+ Đưa ra màn hình số lớn nhất và số nhỏ nhất có trong dãy số.
+ Tính tổng và trung bình cộng các số có trong dãy.
Chú ý: Không sử dụng mảng.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0, sum = 0, count = 0;
        System.out.println("Nhập dãy số nguyên có giá trị lớn hơn 0, kết thúc việc nhập dãy số nguyên đó bằng số 0");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (count == 0) {
                max = n;
                min = n;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            sum += n;
            count++;
        }
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Tổng các số trong dãy là: " + sum);
        System.out.println("Trung bình cộng các số trong dãy là: " + (float) sum / count);
    }
}
