import java.util.Scanner;
public class Cau9 {
    /*Viết chương trình nhập vào số giây, sau đó đưa ra màn hình số năm, ngày, giờ, phút, giây
tương ứng. Ví dụ: 1_075_838_977 giây = x năm + y ngày + z ngày + m giờ + n phút + q giây */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giây: ");
        long seconds = sc.nextLong();
        long year = seconds / 3_155_760_000L;
        long day = (seconds % 3_155_760_000L) / 86_400;
        long hour = ((seconds % 3_155_760_000L) % 86_400) / 3600;
        long minute = (((seconds % 3_155_760_000L) % 86_400) % 3600) / 60;
        long second = (((seconds % 3_155_760_000L) % 86_400) % 3600) % 60;
        System.out.println(seconds + " giây = " + year + " năm + " + day + " ngày + " + hour + " giờ + " + minute + " phút + " + second + " giây");
    }
}
