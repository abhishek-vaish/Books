package solution;

import java.util.Scanner;

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

class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String bookName[] = new String[n];
        String authorName[] = new String[n];
        long ISBN[] = new long[n];
        scan.nextLine();
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                bookName[i] = scan.nextLine();
                authorName[i] = scan.nextLine();
                ISBN[i] = scan.nextLong();
                scan.nextLine();
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------------------");
            System.out.println("Book Name: " + bookName[j] + "\nAuthor Name: " + authorName[j] + "\nISBN: " + ISBN[j]);
            System.out.println("-------------------------------");
        }
    }
}

