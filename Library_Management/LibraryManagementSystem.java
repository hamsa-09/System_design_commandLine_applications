import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LibraryManagementSystem {
    private List<Book> books;
    private List<User> users;
    private List<Transaction> transactions;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBook(String title, String author, int totalCopies) {
        String bookId = UUID.randomUUID().toString();
        books.add(new Book(bookId, title, author, totalCopies));
    }

    public void addUser(String name, String email) {
        String userId = UUID.randomUUID().toString();
        users.add(new User(userId, name, email));
    }

    public Book getBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public void borrowBook(String userId, String bookId) {
        User user = getUserById(userId);
        Book book = getBookById(bookId);
        if (user != null && book != null && book.getAvailableCopies() > 0) {
            Date borrowDate = new Date();
            Date dueDate = new Date(borrowDate.getTime() + 14 * 24 * 60 * 60 * 1000); // 14 days
            String transactionId = UUID.randomUUID().toString();
            Transaction transaction = new Transaction(transactionId, user, book, borrowDate, dueDate);
            transactions.add(transaction);
            book.borrowBook();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book borrowing failed.");  
        }
    }

    public void returnBook(String transactionId) {
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionId().equals(transactionId)) {
                transaction.setReturnDate(new Date());
                transaction.getBook().returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book return failed.");
    }

    public void checkOverdueBooks() {
        for (Transaction transaction : transactions) {
            if (transaction.isOverdue()) {
                System.out.println("Overdue book: " + transaction.getBook().getTitle() + " borrowed by " + transaction.getUser().getName());
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 5);
        library.addBook("1984", "George Orwell", 3);
        library.addUser("John Doe", "john.doe@example.com");
        library.addUser("Jane Smith", "jane.smith@example.com");

        User user = library.getUserById(library.users.get(0).getUserId());
        Book book = library.getBookById(library.books.get(0).getBookId());

        library.borrowBook(user.getUserId(), book.getBookId());
        library.checkOverdueBooks();

        // Simulate time passing
        try {
            Thread.sleep(15 * 24 * 60 * 60 * 1000); // 15 days
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        library.checkOverdueBooks();
        library.returnBook(library.transactions.get(0).getTransactionId());
    }
}
