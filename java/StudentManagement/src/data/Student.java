package data;

public class Student {
    private String id; 
    public static String name; 

    public int yob; 
    private double gpa;

    // CONSTRUCTOR
    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    // GETTER & SETTER 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString() -> show thông tin object
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + ", getId()=" + getId()
                + ", getName()=" + getName() + ", getYob()=" + getYob() + ", getGpa()=" + getGpa() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    } 

    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }

    public int getAge() {
        return 2025 - yob; 
    }

    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
    }
}
