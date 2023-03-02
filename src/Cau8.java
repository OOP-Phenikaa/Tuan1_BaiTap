import java.util.Scanner;
public class Cau8 {
/*Viết chương trình nhập vào số bytes, sau đó đưa ra màn hình số Gigabytes, Megabytes,
Kilobytes và Bytes tương ứng. Ví dụ: 1_075_838_977 bytes = 1GB + 2MB + 1Byte */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bytes: ");
        long bytes = sc.nextLong();
        long GB = bytes / 1_073_741_824;
        long MB = (bytes % 1_073_741_824) / 1_048_576;
        long KB = ((bytes % 1_073_741_824) % 1_048_576) / 1024;
        long B = ((bytes % 1_073_741_824) % 1_048_576) % 1024;
        System.out.println(bytes + " bytes = " + GB + "GB + " + MB + "MB + " + KB + "KB + " + B + "B");
    }
}
