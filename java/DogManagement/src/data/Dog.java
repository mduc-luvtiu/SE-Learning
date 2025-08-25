package data;

public class Dog {
    // Khung dữ liệu của Dog 
    private String name; 
    private int yob; 
    private double weight; 

    // CONSTRUCTOR: hàm khởi tạo, hàm phễu nhận thông tin để tạo object 
    // public Dog(String iName, int iYob, double iWeight) {
    //     name = iName; 
    //     yob = iYob; 
    //     weight = iWeight;
    // }

    public Dog(String name, int yob, double weight) {
        this.name = name; 
        this.yob = yob; 
        this.weight = weight;
    }

    // CÁC PHƯƠNG THỨC HÀNH ĐỘNG CỦA OBJECT 
    // Show ra thông tin của object
    public void bark() {
        // System.out.println("Gogogogogo... My name is " + name);
        // System.out.println("Gogogogogo... My yob is " + yob);
        // System.out.println("Gogogogogo... My weight is " + weight);
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }

    // - Nhóm hàm getInfo
    public int getYob() {
        return yob; 
    }

    // - Nhóm hàm setInfo 
    // Thay đổi thông tin của object
    public void setNewWeight(double newWeight) {
        weight = newWeight; 
    }
}

// KHÔNG VIẾT CODE CỦA CLASS Ở BÊN NGOÀI CLASS
