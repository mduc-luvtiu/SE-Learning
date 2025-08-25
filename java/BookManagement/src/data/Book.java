package data;

public class Book {
    private int id; 
    private String bookName; 
    private int numsPage; 
    private int yearPublish; 
    private int price; 
    private int amount;
    
    public Book(int id, String bookName, int numsPage, int yearPublish, int price, int amount) {
        this.id = id;
        this.bookName = bookName;
        this.numsPage = numsPage;
        this.yearPublish = yearPublish;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumsPage() {
        return numsPage;
    }

    public void setNumsPage(int numsPage) {
        this.numsPage = numsPage;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    } 

    public void display() {
        System.out.printf("ID: %d -- Name: %-10s -- Amount: %d\n", id, bookName, amount);
    }

    public void buyBook(int amount) {
        if (amount > this.amount) {
            System.out.println("Amount of this book is not enough !!!");
        }
        else {
            this.amount -= amount; 
            System.out.println("Buy succesfully !!!");
            System.out.println("The information after transaction: ");
            display();
        }
    }
}
