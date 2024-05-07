package org.example;

import java.util.ArrayList;
import java.util.List;

// Абстрактный класс Content
abstract class Content {
    protected String id;
    protected String title;
    protected int views;
    protected int likes;
    protected int dislikes;

    // Конструктор
    public Content(String id, String title) {
        this.id = id;
        this.title = title;
        this.views = 0;
        this.likes = 0;
        this.dislikes = 0;
    }

    public abstract void displayInfo();

    public abstract void updateStats(int views, int likes, int dislikes);
}

// Интерфейс Interactable
interface Interactable {
    void like();
    void dislike();
    void view();
}

public class Video extends Content implements Interactable {
    private int duration;

    public Video(String id, String title, int duration) {
        super(id, title);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Название видео: " + title);
        System.out.println("Просмотры: " + views);
        System.out.println("Лайки: " + likes);
        System.out.println("Дизлайки: " + dislikes);
        System.out.println("Продолжительность: " + duration + " минуты");
    }

    @Override
    public void updateStats(int views, int likes, int dislikes) {
        this.views += views;
        this.likes += likes;
        this.dislikes += dislikes;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public void dislike() {
        this.dislikes++;
    }

    @Override
    public void view() {
        this.views++;
    }
}
