public class Book {
    private String bookTitle;
    private Author author;
    private Integer yearPublicationBook;

    public Book() {

    }

    public Book(String bookTitle, Author author, Integer yearPublicationBook) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublicationBook = yearPublicationBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYearPublicationBook() {
        return yearPublicationBook;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
//
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPublicationBook(Integer yearPublicationBook) {
        this.yearPublicationBook = yearPublicationBook;
    }

    public boolean checkNameAuthor(Author author) {
        if(author.nameAuthor == null || author.nameAuthor.isEmpty() || author.surnameAuthor == null || author.surnameAuthor.isEmpty()) {
            throw new IllegalArgumentException("Error: Name or surname of the author is empty.");
        } else {
            return true;
        }
    }

    public static class Author {
        private String nameAuthor;
        private String surnameAuthor;

        public Author() {

        }

        public Author (String nameAuthor, String surnameAuthor) {
            this.nameAuthor = nameAuthor;
            this.surnameAuthor = surnameAuthor;
        }

        public String getNameAuthor() {
            return nameAuthor;
        }

        public String getSurnameAuthor() {
            return surnameAuthor;
        }

        public void setNameAuthor(String nameAuthor) {
            this.nameAuthor = nameAuthor;
        }
//
        public void setSurnameAuthor(String surnameAuthor) {
            this.surnameAuthor = surnameAuthor;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "nameAuthor='" + nameAuthor + '\'' +
                    ", surnameAuthor='" + surnameAuthor + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", yearPublicationBook=" + yearPublicationBook +
                '}';
    }
}
