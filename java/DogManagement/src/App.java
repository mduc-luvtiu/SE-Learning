import data.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        // Tạo mới một object dog
        // Dùng new để tạo các object mới
        Dog chiHu = new Dog("Chi Hu Hu", 2021, 13); 
        chiHu.bark();

        // Tạo thêm một obj khác 
        Dog ngaoDa = new Dog("NGAO DA", 2020, 10);
        ngaoDa.bark();

        // Cập nhật info
        chiHu.setNewWeight(20);
        System.out.println("After: ");
        chiHu.bark();

        // Hàm lấy dữ liệu 
        System.out.println(chiHu.getYob());

        // Show toàn bộ info theo cách toString()
        System.out.println("Show all info by using toString() - a new behavior");
        System.out.println(chiHu.toString());

        // Hàm toString() rất đặc biệt, @Override. Mục tiêu là show ra tất cả thông tin đã truyền vào

        System.out.println("Play with toString()");
        System.out.println(chiHu);
        System.out.println(chiHu.toString());
        // chiHu là biến con trỏ -> theo lý thuyết sẽ in ra địa chỉ. Nhưng thực tế nó sẽ gọi tới hàm toString() 
        // Nếu không thiết lập toString() nó vẫn chạy được -> sẽ tự động băm vùng RAM của Object thành các con số HEX đại diện cho value vùng RAM đó -> Hash number, nén toàn bộ data thành 1 con số, MD5, SHA-256,...
    }
}
