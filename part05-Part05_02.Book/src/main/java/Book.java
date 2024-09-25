public class Book {
    private String title;
    private String author;
    private int pages;

    public Book (String author, String name, int pages) {
        this.title = name;
        this.author = author;
        this.pages = pages;
    }

    public String getName () {
        return this.title;
    }

    public String getAuthor () {
        return this.author;
    }

    public int getPages () {
        return this.pages;
    }

    public String toString () {
        return "" + this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
