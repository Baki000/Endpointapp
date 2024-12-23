package com.example.endpointapp;

public class YourRequestType {
    private String name;
    private String description;
    private int difficulty;
    private int category;
    private long price;
    private String date; // Use String for simplicity; alternatively, use java.util.Date or java.time.LocalDate

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "YourRequestType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", difficulty=" + difficulty +
                ", category=" + category +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
