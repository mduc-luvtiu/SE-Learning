import data.Book;

public class App {
    public static void main(String[] args) throws Exception {
        // Import data
        Book b1 = new Book(1, "Java Basics", 350, 2020, 120000, 10);
        Book b2 = new Book(2, "Algorithms and Programming", 500, 2018, 150000, 5);
        Book b3 = new Book(3, "Data Structures", 420, 2021, 135000, 7);
        Book b4 = new Book(4, "Fundamentals of Machine Learning", 600, 2022, 200000, 3);
        Book b5 = new Book(5, "Web Development with Spring", 480, 2019, 175000, 8);

        b1.display();
        b1.buyBook(11);
    }
}
