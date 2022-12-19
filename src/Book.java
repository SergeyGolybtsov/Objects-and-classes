public class Book {
    private String bookName;
    private int yearPublic;
    private Author author;

    public Book(String bookName, int yearPublik, Author author) {
        this.bookName = bookName;
        this.yearPublic = yearPublik;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }


}

