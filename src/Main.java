public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Пушкин");
        Author author2 = new Author("Сергей", "Есенин");
        Book book1 = new Book("Название 1", 1922, author1);
        Book book2 = new Book("Название 2", 1912, author2);
        book1.setYearPublic(1907);
        System.out.println(author1.getFerstName() + " " + author1.getSurName() + " " + book1.getBookName() + " " + book1.getYearPublic());
        System.out.println(author2.getFerstName() + " " + author2.getSurName() + " " + book2.getBookName() + " " + book2.getYearPublic());

    }

}