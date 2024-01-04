public class Book {
    private String author;
    private String title;
    private int year;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.year = 0;
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;

        if (this.title.equals(comparedBook.title) && this.year == comparedBook.year) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
