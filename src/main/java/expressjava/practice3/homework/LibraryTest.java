package expressjava.practice3.homework;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        String category = library.category;
        int year = library.year;
        String author = library.author;
        //String bookTitle = library.bookTitle; bookTitle field is private
    }
}
