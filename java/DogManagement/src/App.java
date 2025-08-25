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

    }
}
