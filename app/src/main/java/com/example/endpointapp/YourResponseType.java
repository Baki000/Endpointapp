package com.example.endpointapp;

public class YourResponseType {
    private String name;
    private String description;
    private int difficulty;
    private int category;
    private double price;
    private String date; // Use String for simplicity; alternatively, use java.util.Date or java.time.LocalDate
    private int status;
    private String guide; // Nullable field, use String or the appropriate type
    private int guideId;
    private int id;
    private boolean deleted;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "YourResponseType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", difficulty=" + difficulty +
                ", category=" + category +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", status=" + status +
                ", guide='" + guide + '\'' +
                ", guideId=" + guideId +
                ", id=" + id +
                ", deleted=" + deleted +
                '}';
    }
}

