public class Book {

    private final String nameBook;
    private final Author authorBook;
    private int releaseBook;

        public Book(String nameBook, Author authorBook, int releaseBook) {
            this.nameBook = nameBook;
            this.authorBook = authorBook;
            this.releaseBook = releaseBook;
        }

    public String getNameBook() {
            return this.nameBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getReleaseBook() {
            return this.releaseBook;
    }

    public void setReleaseBook(int releaseBook) {
            this.releaseBook = releaseBook;
    }


//    public String toString() {
//        return
//    }
}
