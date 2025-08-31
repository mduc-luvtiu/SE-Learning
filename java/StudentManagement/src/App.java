import java.util.Scanner;

import data.Student;

public class App {
    public static void main(String[] args) throws Exception {
        saveAStudent();
        // inputStudent();
    }
    // Nhập từ bàn phím -> Cần Scaner object bàn phím 
    // Máy Cam, Scanner tiệm photo, bàn phím, chuột,... -> quét dữ liệu đưa vào máy tính 
    // new để xử -> từ bàn phím đi vào RAM nên phải có biến để hứng. 
    public static void inputStudent() {
        String id, name; 
        int yob; 
        double gpa; 

        Scanner sc = new Scanner(System.in); 
        System.out.print("Input id: ");
        id = sc.nextLine(); 

        System.out.print("Input name: ");
        name = sc.nextLine(); 

        System.out.print("Input yob: ");
        yob = sc.nextInt(); 

        System.out.print("Input gpa: ");
        gpa = sc.nextDouble(); 

        Student x = new Student(id, name, yob, gpa); 
        x.showProfile();
    }

    public static void saveAStudent() {
        Student An = new Student("SE001", "Nguyen An", 1999, 9.3); 
        Student Binh = new Student("SE002", "Hoang Binh", 2005, 9.3); 

        An.showProfile();
        Binh.showProfile();

        // Chấm xổ gì, Access Modifier / Access Specifier 
        System.out.println("An name (directly): " + An.name);
        An.name = "Mai Xuan Duc";
        System.out.println("An name (directly): " + An.getName());
        System.out.println("Binh name: " + Binh.name);

        An.sayHi();
        Student.sayHi(); // Dùng chung cho tất cả object -> nên gọi thẳng từ class. 

    }
}
