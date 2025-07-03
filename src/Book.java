public class Book {
    private int id;
    private String title;
    private String author;
    private Status status;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = Status.AVAILABLE;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + getStatus();
    }
}