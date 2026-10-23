package expressjava.practice3.homework;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.printf("library.category is %s\n", library.category);
        System.out.printf("library.year is %d\n", library.year);
        System.out.printf("library.author is %s\n", library.author);
        //String bookTitle = library.bookTitle; bookTitle field is private
    }
}
