package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String username;
    private List<Video> uploadedVideos;
    private List<Comment> comments;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
        this.uploadedVideos = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void addVideo(Video video) {
        uploadedVideos.add(video);
    }

    public void removeVideo(Video video) {
        uploadedVideos.remove(video);
    }

    public void displayUploadedVideos() {
        System.out.println("Загруженные видео пользователем " + username + ":");
        for (Video video : uploadedVideos) {
            video.displayInfo();
        }
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void displayComments() {
        System.out.println("Комментарий от " + username + ":");
        for (Comment comment : comments) {
            comment.displayInfo();
        }
    }
}
