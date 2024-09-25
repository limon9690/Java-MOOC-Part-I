public class Book {
    private String name;
    private int pages;
    private String year;

    public Book (String name, int pages, String year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
    
}
