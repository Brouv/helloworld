public class Book {

    String nameBook;
    String authorBook;
    int releaseBook;

        public Book(String nameBook, String authorBook, int releaseBook) {
            this.nameBook = nameBook;
            this.authorBook = authorBook;
            this.releaseBook = releaseBook;
        }

    public String getNameBook() {
            return this.nameBook;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public int getReleaseBook() {
            return this.releaseBook;
    }

    public void setReleaseBook(int releaseBook) {
            this.releaseBook = releaseBook;
    }
}
