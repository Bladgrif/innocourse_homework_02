package ru.inno.course;

public class Item {
    public String articleNumber,
            title,
            price,
            count,
            colour;

    public Item() {
        this.articleNumber = "Unknown";
        this.title = "Unknown";
        this.price = "Unknown";
        this.count = "Unknown";
        this.colour = "Unknown";
    }

    public Item(int articleNumber) {
        this.articleNumber = Integer.toString(articleNumber);
        this.title = "Unknown";
        this.price = "Unknown";
        this.count = "Unknown";
        this.colour = "Unknown";
    }


    public Item(int articleNumber, String title) {
        this.articleNumber = Integer.toString(articleNumber);
        this.title = title;
        this.price = "Unknown";
        this.count = "Unknown";
        this.colour = "Unknown";
    }

    public Item(int articleNumber, String title, int price) {
        this.articleNumber = Integer.toString(articleNumber);
        this.title = title;
        this.price = Integer.toString(price);
        this.count = "Unknown";
        this.colour = "Unknown";
    }

    public Item(int articleNumber, String title, int price, int count) {
        this.articleNumber = Integer.toString(articleNumber);
        this.title = title;
        this.price = Integer.toString(price);
        this.count = Integer.toString(count);
        this.colour = "Unknown";
    }

    public Item(int articleNumber, String title, int price, int count, String colour) {
        this.articleNumber = Integer.toString(articleNumber);
        this.title = title;
        this.price = Integer.toString(price);
        this.count = Integer.toString(count);
        this.colour = colour;
    }
}
