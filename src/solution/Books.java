package solution;

public class Books {
    private String bookName;
    private String authorName;
    private long ISBN;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void Books(String BookName, String AuthorName, long ISBN) {
        this.bookName = BookName;
        this.authorName = AuthorName;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return
                ("Book Name: " + bookName + "\nAuthor Name: " + authorName + "\nISBN: " + ISBN);
    }
}
