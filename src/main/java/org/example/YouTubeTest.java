package org.example;

public class YouTubeTest {
    public static void main(String[] args) {
        Video video1 = new Video("1", "Основы Java", 10);
        Video video2 = new Video("2", "Объектно-ориентированного программирования", 15);

        Comment comment1 = new Comment("1", "Пользователь1", "Лучшее видео!");
        Comment comment2 = new Comment("2", "Пользователь2", "Спасибо за туториал!");

        User user = new User("1", "Stasik");

        user.addVideo(video1);
        user.addVideo(video2);
        user.addComment(comment1);
        user.addComment(comment2);

        user.displayUploadedVideos();

        user.displayComments();

        video1.like();
        video1.view();
        video2.dislike();

        video1.updateStats(1, 1, 0);
        video2.updateStats(1, 0, 1);

        video1.displayInfo();
        video2.displayInfo();
    }
}
