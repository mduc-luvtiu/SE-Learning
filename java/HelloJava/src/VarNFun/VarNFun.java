import java.util.Scanner;

public class VarNFun {
    public static void main(String[] args) {
        // playWithVariables();
        // playWithIntegers();
        // playWithDoubles();
        // playWithCharacters();
        // playWithBooleans();
        // printIntegerList();
        // printIntegerList(10); 

        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        printIntegerList(n); // truyền tham trị, pass by value 
                            // OOP: pass by reference - truyền tham chiếu
    }

    public static int getAPositiveInteger() {
        int n;
        // Nhập từ bàn phím, xài OOP
        Scanner banPhimCuaTui = new Scanner(System.in);

        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();

        return n;
    }

    // nâng cấp: in n số tự nhiên tính từ 1
    // Class bất kì chứ nhiều hàm trùng tên nhưng khác phần tham số đầu vào (khác trên data type không phải tên)
    // Gọi là OVERLOAD / OVERLOADING: quá tải hàm
    // vs. OVERRIDE
    // POLYMORPHISM : Tính đa hình
    public static void printIntegerList(int n) {
        System.out.println("The list of " + n + " first integer");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    // In ra các số tự nhiên từ 1 đến 100 
    public static void printIntegerList() {
        System.out.println("The list of 100 first integer");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void playWithBooleans() {
        boolean marriedStatus = false; 
        if (marriedStatus == true)
            System.out.println("I love you !!!");
        else 
            System.out.println("Goodbye");
    }

    public static void playWithCharacters() {
        // 2 byte cho kiểu char -> do lư bằng mã Unicode 
        char m = '$'; 
        System.out.println("unit: " + m);

        // lưu chuỗi -> String 
        String name = "Mai Xuan Duc"; 
        System.out.println("name: " + name);
        System.out.println("First letter: "+ name.charAt(0));
        System.out.println("My name in lowercase: " + name.toLowerCase());
    }

    public static void playWithDoubles() {
        double pi = 3.14; 
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); // Không dùng lf

        float vat = 0.1F; // Thêm hậu tố F để đảm bảo là số dạng float, nếu không nó sẽ bị hiểu là double -> lỗi
        System.out.println("vat: " + vat);
    }

    public static void playWithIntegers() {
        int n = 39; // Mọi con số, ký tự xuất hiện trong code được gọi là literal value
        System.out.println("n: " + n);

        long m = 3_000_000_000_000L; // Thêm đuôi L và dùng _ ngăn cách các hàng
        System.out.println("m: " + m);

        int status = 0xFA; // Hệ 16
        System.out.println("status: " + status);

        int phone = 077; // Số 0 đứng đầu -> hiểu là số hệ 8 (octal)
        System.out.println("phone: " + phone);

    }

    public static void playWithVariables() {
        // Biến là vùng RAM được đặt tên, chiếm 1 số byte tuỳ loại dữ liệu, thông tin mà nó chứa.
        // Biến là cách đặt tên cho 1 đại lượng / giá trị - đơn / phức 
        int age = 20; 
        int a = 10, b; 
        b = 100; 
        // int - 4 byte 
        System.out.println("age: " + a);

        int yob = 2001; 
        age = 201 - yob; 

        System.out.println("age: " + age + a);
    }
}
