package expressjava.practice3.homework.test;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        //String bookTitle = library.bookTitle; // compile error (private field)
        String author = library.author;
        int year = library.year;
        String category = library.category;
    }
}
