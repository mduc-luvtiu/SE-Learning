import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // inputProfile();
        inputProfileTryCatch();
    }

    public static void inputProfileTryCatch() {
        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a right INTEGER");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Name: " + name + " | yob:" + yob + " | address: " + address);
    }

    public static void inputProfile() {
        // Mô tả tình trạng lạc trôi chữ
        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        // yob = sc.nextInt(); // Convert data từ bàn phím -> từ chuỗi thành số
        // sc.nextLine(); // Xoá bộ đệm sau khi đọc số

        yob = Integer.parseInt(sc.nextLine()); // nextLine lấy sạch buffer, còn chuỗi số -> số

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Name: " + name + " | yob:" + yob + " | address: " + address);
    }

}
