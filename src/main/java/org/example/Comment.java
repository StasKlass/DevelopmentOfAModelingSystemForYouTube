package org.example;

public class Comment extends Content {
    private String author;
    private String text;

    public Comment(String id, String author, String text) {
        super(id, "");
        this.author = author;
        this.text = text;
    }

    @Override
    public void displayInfo() {
        System.out.println("Комментарий от " + author + ": " + text);
    }

    @Override
    public void updateStats(int views, int likes, int dislikes) {
    }
}
