public class Book {
    private String title;
    private String author;

    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }

    // constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getters
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
    
}
