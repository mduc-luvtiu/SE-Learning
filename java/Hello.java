import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // In ra màn hình
        System.out.println("Xin chào, đây là chương trình Java mẫu!");

        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số nguyên
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        // Tính tổng
        int tong = a + b;

        // Xuất kết quả
        System.out.println("Tổng của " + a + " và " + b + " là: " + tong);

        // Đóng Scanner
        scanner.close();
    }
}
