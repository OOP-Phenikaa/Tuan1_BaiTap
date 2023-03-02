import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Cau11 {
    /*Xây dựng chương trình làm việc với mảng số nguyên như sau
a. Nhập một mảng các số nguyên vào từ bàn phím với số phần tử cho trước.
b. Xây dựng các hàm trả về giá trị lớn nhất và giá trị nhỏ nhất của mảng, với mảng số nguyên là tham
số đầu vào của hàm.
c. Xây dựng hàm dùng để sắp xếp mảng, với mảng số nguyên là tham số đầu vào của hàm. */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int key;
        do {
            do {
                System.out.println();
                System.out.println("1. Tìm giá trị lớn nhất của mảng");
                System.out.println("2. Tìm giá trị nhỏ nhất của mảng");
                System.out.println("3. Sắp xếp mảng");
                System.out.println("0. Thoát");
                System.out.println("Nhập lựa chọn của bạn: ");
                key = sc.nextInt();
                if (key < 0 || key > 3) {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            } while (key < 0 || key > 3);
            switch (key) {
                case 1:
                    System.out.println("Giá trị lớn nhất của mảng là: " + max(arr));
                    break;
                case 2:
                    System.out.println("Giá trị nhỏ nhất của mảng là: " + min(arr));
                    break;
                case 3:
                    System.out.println("Mảng sau khi sắp xếp là: ");
                    sort(arr);
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
            }
        } while (key != 0);
        System.out.println("Bạn muốn tiếp tục hay không");
        System.out.println("1. Có");
        System.out.println("2. Không");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            main(args);
        } else {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình");
        }
    }
}
